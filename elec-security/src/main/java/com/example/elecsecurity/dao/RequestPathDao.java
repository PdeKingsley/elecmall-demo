package com.example.elecsecurity.dao;

import com.example.elecsecurity.entity.RequestPath;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 请求路径表数据库访问层
 *
 * @author wd
 */
public interface RequestPathDao {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RequestPath queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RequestPath> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param requestPath 实例对象
     * @return 对象列表
     */
    List<RequestPath> queryAll(RequestPath requestPath);

    /**
     * 新增数据
     *
     * @param requestPath 实例对象
     * @return 影响行数
     */
    int insert(RequestPath requestPath);

    /**
     * 修改数据
     *
     * @param requestPath 实例对象
     * @return 影响行数
     */
    int update(RequestPath requestPath);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
}
