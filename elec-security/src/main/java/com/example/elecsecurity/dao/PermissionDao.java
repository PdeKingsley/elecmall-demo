package com.example.elecsecurity.dao;

import com.example.elecsecurity.entity.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * permission表数据库访问层
 *
 * @author wd
 */
public interface PermissionDao {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Permission queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Permission> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param permission 实例对象
     * @return 对象列表
     */
    List<Permission> queryAll(Permission permission);

    /**
     * 新增数据
     *
     * @param permission 实例对象
     * @return 影响行数
     */
    int insert(Permission permission);

    /**
     * 修改数据
     *
     * @param permission 实例对象
     * @return 影响行数
     */
    int update(Permission permission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 查询用户的权限
     *
     * @param userId
     * @return
     */
    List<Permission> selectListByUser(Integer userId);

    /**
     * 查询具体某个接口的权限
     *
     * @param path 接口路径
     * @return
     */
    List<Permission> selectListByPath(String path);
}
