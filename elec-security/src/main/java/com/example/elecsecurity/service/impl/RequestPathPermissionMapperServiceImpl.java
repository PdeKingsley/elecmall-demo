package com.example.elecsecurity.service.impl;

import com.example.elecsecurity.dao.RequestPathPermissionMapperDao;
import com.example.elecsecurity.entity.RequestPathPermissionMapper;
import com.example.elecsecurity.service.RequestPathPermissionMapperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wd
 *
 * 路径权限关联表服务实现类
 */
@Service("requestPathPermissionMapperService")
public class RequestPathPermissionMapperServiceImpl implements RequestPathPermissionMapperService {
    @Resource
    private RequestPathPermissionMapperDao requestPathPermissionMapperDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RequestPathPermissionMapper queryById(Integer id) {
        return this.requestPathPermissionMapperDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<RequestPathPermissionMapper> queryAllByLimit(int offset, int limit) {
        return this.requestPathPermissionMapperDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param requestPathPermissionMapper 实例对象
     * @return 实例对象
     */
    @Override
    public RequestPathPermissionMapper insert(RequestPathPermissionMapper requestPathPermissionMapper) {
        this.requestPathPermissionMapperDao.insert(requestPathPermissionMapper);
        return requestPathPermissionMapper;
    }

    /**
     * 修改数据
     *
     * @param requestPathPermissionMapper 实例对象
     * @return 实例对象
     */
    @Override
    public RequestPathPermissionMapper update(RequestPathPermissionMapper requestPathPermissionMapper) {
        this.requestPathPermissionMapperDao.update(requestPathPermissionMapper);
        return this.queryById(requestPathPermissionMapper.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.requestPathPermissionMapperDao.deleteById(id) > 0;
    }
}
