package com.User;

public class User {
    private Integer UserId;
    private String Name;
    private String UserName;
    private String Address;
    private String Phonenumber;

    public User(Integer userId, String name, String userName, String address, String phonenumber) {
        UserId = userId;
        Name = name;
        UserName = userName;
        Address = address;
        Phonenumber = phonenumber;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }
}
