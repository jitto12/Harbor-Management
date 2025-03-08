package com.jitto.harbor_management.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Admin_Login")
public class AdminLoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "userName")
    private String userName;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public AdminLoginModel(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public AdminLoginModel() {
    }
}
