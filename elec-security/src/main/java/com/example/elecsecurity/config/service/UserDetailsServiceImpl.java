package com.example.elecsecurity.config.service;

import com.example.elecsecurity.entity.Permission;
import com.example.elecsecurity.entity.UserAccount;
import com.example.elecsecurity.service.PermissionService;
import com.example.elecsecurity.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserAccountService userAccountService;
    @Autowired
    private PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username == null || "".equals(username)) {
            throw new RuntimeException("用户不能为空");
        }
        //根据用户名查询用户
        UserAccount userAccount = userAccountService.selectByName(username);
        if (userAccount == null) {
            throw new RuntimeException("用户不存在");
        }
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (userAccount != null) {
            //获取该用户所拥有的权限
            List<Permission> permissions = permissionService.selectListByUser(userAccount.getId());
            // 声明用户授权
            permissions.forEach(permission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getCode());
                grantedAuthorities.add(grantedAuthority);
            });
        }
        return new User(userAccount.getUserName(), userAccount.getPassword(),
                userAccount.getEnabled(),userAccount.getAccountNonExpired(),
                userAccount.getCredentialsNonExpired(), userAccount.getAccountNonLocked(), grantedAuthorities);
    }
}
