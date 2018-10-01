package com.niepan.springbootai3.bean;

public class LoginUser {

    private Integer u_id;
    private String u_username;
    private String u_password;

    @Override
    public String toString() {
        return "LoginUser{" +
                "u_id=" + u_id +
                ", u_username='" + u_username + '\'' +
                ", u_password='" + u_password + '\'' +
                '}';
    }

    public LoginUser() {
    }

    public LoginUser(String u_username, String u_password) {
        this.u_username = u_username;
        this.u_password = u_password;
    }

    public LoginUser(Integer u_id, String u_username, String u_password) {
        this.u_id = u_id;
        this.u_username = u_username;
        this.u_password = u_password;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }
}
