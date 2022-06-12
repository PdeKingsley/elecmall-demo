package com.example.elecsecurity.entity;

import java.io.Serializable;

/**
 * 请求路径实体类
 *
 * @author wd
 */
public class RequestPath implements Serializable {
    private static final long serialVersionUID = -7145259026210097626L;

    //主键id
    private Integer id;
    //请求路径
    private String url;
    //路径描述
    private String description;
    //是否可用默认可用
    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
