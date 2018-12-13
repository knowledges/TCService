package com.pojo;
/* 用户表-乘客 */
public class Users {
    /* 用户id */
    private String id;
    /* 用户名称 */
    private String userName;
    /* 用户密码 */
    private String password;
    /* 用户手机号 */
    private String phone;
    /* 用户创建时间 */
    private DateTime createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(DateTime createTime) {
        this.createTime = createTime;
    }
}
