package com.example.elecsecurity.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wd
 *
 * 权限信息实体类
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = -8024449783759025336L;

    //主键id
    private Integer id;
    //权限code
    private String code;
    //权限名
    private String name;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //权限存在状态，默认存在
    private Boolean enabled;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public Date getCreateTime() { return createTime; }

    public void setCreateTime(Date createTime) {this.createTime = createTime;}

    public Date getUpdateTime() { return updateTime; }

    public void setUpdateTime(Date updateTime) {this.updateTime = updateTime;}

    public Boolean getEnabled() { return enabled; }

    public void setEnabled(Boolean enabled) {this.enabled = enabled;}
}
