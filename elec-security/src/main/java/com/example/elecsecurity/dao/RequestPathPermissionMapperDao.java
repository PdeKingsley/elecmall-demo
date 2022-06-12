package com.example.elecsecurity.dao;

import com.example.elecsecurity.entity.RequestPathPermissionMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wd
 *
 * 路径权限关联表数据库访问层
 */
public interface RequestPathPermissionMapperDao {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RequestPathPermissionMapper queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RequestPathPermissionMapper> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param requestPathPermissionRelation 实例对象
     * @return 对象列表
     */
    List<RequestPathPermissionMapper> queryAll(RequestPathPermissionMapper requestPathPermissionRelation);

    /**
     * 新增数据
     *
     * @param requestPathPermissionRelation 实例对象
     * @return 影响行数
     */
    int insert(RequestPathPermissionMapper requestPathPermissionRelation);

    /**
     * 修改数据
     *
     * @param requestPathPermissionRelation 实例对象
     * @return 影响行数
     */
    int update(RequestPathPermissionMapper requestPathPermissionRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
}
