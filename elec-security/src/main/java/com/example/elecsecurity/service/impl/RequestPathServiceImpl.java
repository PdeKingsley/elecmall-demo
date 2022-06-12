package com.example.elecsecurity.service.impl;

import com.example.elecsecurity.dao.RequestPathDao;
import com.example.elecsecurity.entity.RequestPath;
import com.example.elecsecurity.service.RequestPathService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("requestPathService")
public class RequestPathServiceImpl implements RequestPathService {
    @Resource
    private RequestPathDao requestPathDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RequestPath queryById(Integer id) {
        return this.requestPathDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RequestPath> queryAllByLimit(int offset, int limit) {
        return this.requestPathDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param requestPath 实例对象
     * @return 实例对象
     */
    @Override
    public RequestPath insert(RequestPath requestPath) {
        this.requestPathDao.insert(requestPath);
        return requestPath;
    }

    /**
     * 修改数据
     *
     * @param requestPath 实例对象
     * @return 实例对象
     */
    @Override
    public RequestPath update(RequestPath requestPath) {
        this.requestPathDao.update(requestPath);
        return this.queryById(requestPath.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.requestPathDao.deleteById(id) > 0;
    }
}
