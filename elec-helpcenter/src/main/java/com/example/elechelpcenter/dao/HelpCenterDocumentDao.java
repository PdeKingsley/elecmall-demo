package com.example.elechelpcenter.dao;

import com.example.elechelpcenter.entity.HelpCenterDocument;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * helpCenterDocument表数据库访问层
 *
 * @author wd
 */
public interface HelpCenterDocumentDao {
    /**
     *
     * 通过ID查询文档
     *
     * @param id
     * @return 文档
     */
    HelpCenterDocument queryById(Integer id);

    /**
     * 通过title查询文档
     *
     * @param title
     * @return
     */
    HelpCenterDocument queryByTitle(String title);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 文档列表
     */
    List<HelpCenterDocument> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

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
    int insert(HelpCenterDocument helpCenterDocument);

    /**
     * 修改文档
     *
     * @param helpCenterDocument 实例对象
     * @return 影响行数
     */
    int update(HelpCenterDocument helpCenterDocument);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
}
