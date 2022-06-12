package com.example.elecsecurity.service;

import com.example.elecsecurity.entity.RequestPath;

import java.util.List;

/**
 * 请求路径表服务接口
 *
 * @author wd
 */
public interface RequestPathService {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RequestPath queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RequestPath> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param requestPath 实例对象
     * @return 实例对象
     */
    RequestPath insert(RequestPath requestPath);

    /**
     * 修改数据
     *
     * @param requestPath 实例对象
     * @return 实例对象
     */
    RequestPath update(RequestPath requestPath);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
}
