package com.example.elecsecurity.entity;

import java.io.Serializable;

/**
 * 路径权限关联表实体类
 *
 * @author wd
 */
public class RequestPathPermissionMapper implements Serializable {
    private static final long serialVersionUID = 825731979900042244L;

    //主键id
    private Integer id;
    //请求路径id
    private Integer urlId;
    //权限id
    private Integer permissionId;
    //是否可用，默认可用
    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
