package com.example.fooddelivery.User;

public class User {

    private String name;
    private String password;
    private String Phone;

    public User(){

    }

    public User(String name, String password, String phone) {
        this.name = name;
        this.password = password;
        this.Phone=phone;
    }
    public String getPhone(){
        return Phone;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
