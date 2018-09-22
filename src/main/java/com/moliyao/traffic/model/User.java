package com.moliyao.traffic.model;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String password;

    private String uuid;

    private Date createdate;

    private Date logindate;

    private String operateuid;

    private String telephone;

    private String email;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    public String getOperateuid() {
        return operateuid;
    }

    public void setOperateuid(String operateuid) {
        this.operateuid = operateuid == null ? null : operateuid.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", uuid='" + uuid + '\'' +
                ", createdate=" + createdate +
                ", logindate=" + logindate +
                ", operateuid='" + operateuid + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", state=" + state +
                '}';
    }
}