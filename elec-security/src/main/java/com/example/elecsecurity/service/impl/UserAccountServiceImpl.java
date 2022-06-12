package com.example.elecsecurity.service.impl;

import com.example.elecsecurity.dao.UserAccountDao;
import com.example.elecsecurity.entity.UserAccount;
import com.example.elecsecurity.service.UserAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wd
 *
 * 用户账号表服务实现类
 */
@Service("userAccountService")
public class UserAccountServiceImpl implements UserAccountService {
    @Resource
    UserAccountDao userAccountDao;

    /**
     * 通过ID查询单个用户
     *
     * @param id 主键
     * @return
     */
    @Override
    public UserAccount queryById(Integer id) {
        return this.userAccountDao.queryById(id);
    }

    /**
     * 查询若干用户
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return
     */
    @Override
    public List<UserAccount> queryAllByLimit(int offset, int limit) {
        return this.userAccountDao.queryAllByLimit(offset,limit);
    }

    /**
     * 插入用户数据
     *
     * @param userAccount 实例对象
     * @return
     */
    @Override
    public UserAccount insert(UserAccount userAccount) {
        this.userAccountDao.insert(userAccount);
        return userAccount;
    }

    /**
     * 更新用户数据
     *
     * @param userAccount 实例对象
     * @return
     */
    @Override
    public UserAccount update(UserAccount userAccount) {
        this.userAccountDao.update(userAccount);
        return userAccount;
    }

    /**
     * 删除某一用户，这里做的是软删除
     *
     * @param id 主键
     * @return
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userAccountDao.deleteById(id) > 0;
    }

    /**
     * 根据用户名查找用户
     *
     * @param userName
     * @return
     */
    @Override
    public UserAccount selectByName(String userName) {
        return this.userAccountDao.selectByName(userName);
    }
}
