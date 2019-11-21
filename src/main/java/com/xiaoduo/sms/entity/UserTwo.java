package com.xiaoduo.sms.entity;

import java.io.Serializable;

/**
 * @author 小舵
 * @program: sms
 * @description: 描述 测试
 * @time 2019/11/15 17:59
 */

public class UserTwo implements Serializable {

    private static final long serialVersionUID = -408113276337343627L;

    private Integer id;
    private String bz;
    private String userName;
    private String trueName;
    private String password;
    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
