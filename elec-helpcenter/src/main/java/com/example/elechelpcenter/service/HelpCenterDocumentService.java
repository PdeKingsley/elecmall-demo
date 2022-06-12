package com.example.elechelpcenter.service;

import com.example.elechelpcenter.entity.HelpCenterDocument;

import java.util.List;

/**
 * helpCenterDocument表服务接口
 *
 * @author wd
 */
public interface HelpCenterDocumentService {
    /**
     *
     * 通过ID查询文档
     *
     * @param id
     * @return 文档
     */
    HelpCenterDocument queryById(Integer id);


    /**
     *
     * 通过title查询文档
     *
     * @param title
     * @return 文档
     */
    HelpCenterDocument queryByTitle(String title);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 文档列表
     */
    List<HelpCenterDocument> queryAllByLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param helpCenterDocument 实例对象
     * @return 文档列表
     */
    List<HelpCenterDocument> queryAll(HelpCenterDocument helpCenterDocument);

    /**
     * 新增文档
     *
     * @param helpCenterDocument 实例对象
     * @return 影响行数
     */
    HelpCenterDocument insert(HelpCenterDocument helpCenterDocument);

    /**
     * 修改文档
     *
     * @param helpCenterDocument 实例对象
     * @return 影响行数
     */
    HelpCenterDocument update(HelpCenterDocument helpCenterDocument);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    boolean deleteById(Integer id);
}
