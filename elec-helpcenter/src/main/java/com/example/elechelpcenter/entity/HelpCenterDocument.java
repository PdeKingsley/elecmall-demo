package com.example.elechelpcenter.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wd
 *
 * 帮助中心文档实体类
 */
public class HelpCenterDocument implements Serializable {
    private static final long serialVersionUID = 5600961202462616711L;

    //主键id
    private Integer id;

    //文档标题
    private String title;

    //文档内容
    private String content;

    //文档创建时间
    private Date createTime;

    //文档更新时间
    private Date updateTime;

    //更新人姓名，默认为平台管理员
    private String updateUserName;

    //管理员账号id
    private Integer updateUserId;

    //状态，默认可用
    private Boolean enabled;

    //文档类型，0：目录，1：文本
    private Integer tag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getTag() { return tag; }

    public void setTag(Integer tag) { this.tag = tag; }
}
