package com.example.elecsecurity.service;

import com.example.elecsecurity.entity.Permission;

import java.util.List;

/**
 * permission表服务接口
 *
 * @author wd
 */
public interface PermissionService {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Permission queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Permission> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param Permission 实例对象
     * @return 实例对象
     */
    Permission insert(Permission Permission);

    /**
     * 修改数据
     *
     * @param Permission 实例对象
     * @return 实例对象
     */
    Permission update(Permission Permission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 查询用户的权限列表
     *
     * @param userId
     * @return
     */
    List<Permission> selectListByUser(Integer userId);

    /**
     * 查询具体某个接口的权限
     *
     * @param path
     * @return
     */
    List<Permission> selectListByPath(String path);
}
