package com.example.elechelpcenter.service.impl;

import com.example.elechelpcenter.dao.HelpCenterDocumentDao;
import com.example.elechelpcenter.entity.HelpCenterDocument;
import com.example.elechelpcenter.service.HelpCenterDocumentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wd
 *
 * 帮助文档服务实现类
 */
@Service("helpCenterDocumentService")
public class HelpCenterDocumentServiceImpl implements HelpCenterDocumentService {
    @Resource
    private HelpCenterDocumentDao helpCenterDocumentDao;

    /**
     * 通过ID查询文档
     *
     * @param id
     * @return
     */
    @Override
    public HelpCenterDocument queryById(Integer id) {
        return this.helpCenterDocumentDao.queryById(id);
    }

    /**
     * 通过title查询文档
     *
     * @param title
     * @return
     */
    @Override
    public HelpCenterDocument queryByTitle(String title) {
        return this.helpCenterDocumentDao.queryByTitle(title);
    }

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return
     */
    @Override
    public List<HelpCenterDocument> queryAllByLimit(int offset, int limit) {
        return this.helpCenterDocumentDao.queryAllByLimit(offset,limit);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param helpCenterDocument 实例对象
     * @return
     */
    @Override
    public List<HelpCenterDocument> queryAll(HelpCenterDocument helpCenterDocument) {
        return this.helpCenterDocumentDao.queryAll(helpCenterDocument);
    }

    /**
     * 新增文档
     *
     * @param helpCenterDocument 实例对象
     * @return
     */
    @Override
    public HelpCenterDocument insert(HelpCenterDocument helpCenterDocument) {
        this.helpCenterDocumentDao.insert(helpCenterDocument);
        return helpCenterDocument;
    }

    /**
     * 修改文档
     *
     * @param helpCenterDocument 实例对象
     * @return
     */
    @Override
    public HelpCenterDocument update(HelpCenterDocument helpCenterDocument) {
        this.helpCenterDocumentDao.update(helpCenterDocument);
        return helpCenterDocument;
    }

    /**
     * 删除文档，这里做软删除
     *
     * @param id 主键
     * @return
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.helpCenterDocumentDao.deleteById(id) > 0;
    }
}
