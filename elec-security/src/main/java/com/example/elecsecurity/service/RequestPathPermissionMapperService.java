package com.example.elecsecurity.service;

import com.example.elecsecurity.entity.RequestPathPermissionMapper;

import java.util.List;

/**
 * 路径权限关联表服务接口
 *
 * @author wd
 */
public interface RequestPathPermissionMapperService {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RequestPathPermissionMapper queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<RequestPathPermissionMapper> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param requestPathPermissionRelation 实例对象
     * @return 实例对象
     */
    RequestPathPermissionMapper insert(RequestPathPermissionMapper requestPathPermissionRelation);

    /**
     * 修改数据
     *
     * @param requestPathPermissionRelation 实例对象
     * @return 实例对象
     */
    RequestPathPermissionMapper update(RequestPathPermissionMapper requestPathPermissionRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
}
