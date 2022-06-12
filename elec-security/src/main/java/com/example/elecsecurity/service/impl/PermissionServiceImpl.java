package com.example.elecsecurity.service.impl;

import com.example.elecsecurity.dao.PermissionDao;
import com.example.elecsecurity.entity.Permission;
import com.example.elecsecurity.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private PermissionDao permissionDao;

    /**
     * 通过ID查询单个权限
     *
     * @param id 主键
     * @return
     */
    @Override
    public Permission queryById(Integer id) {
        return this.permissionDao.queryById(id);
    }

    /**
     * 查询若干权限
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return
     */
    @Override
    public List<Permission> queryAllByLimit(int offset, int limit) {
        return this.permissionDao.queryAllByLimit(offset,limit);
    }

    /**
     * 新增权限
     *
     * @param permission
     * @return
     */
    @Override
    public Permission insert(Permission permission) {
        this.permissionDao.insert(permission);
        return permission;
    }

    /**
     * 更新权限
     *
     * @param permission 实例对象
     * @return
     */
    @Override
    public Permission update(Permission permission) {
        this.permissionDao.update(permission);
        return permission;
    }

    /**
     * 删除某个权限，这里做的是软删除
     *
     * @param id 主键
     * @return
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.permissionDao.deleteById(id) > 0;
    }

    /**
     * 查找某个用户的权限
     *
     * @param userId
     * @return
     */
    @Override
    public List<Permission> selectListByUser(Integer userId) {
        return this.permissionDao.selectListByUser(userId);
    }

    /**
     * 查找某个接口对应权限
     *
     * @param path
     * @return
     */
    @Override
    public List<Permission> selectListByPath(String path) {
        return this.permissionDao.selectListByPath(path);
    }
}
