package com.example.patryk.helloworld;


public class signup_data {

    private String name;
    private String surname;
    private String passwordHash;
    private String number;


    signup_data(String number, String name,String surname, String passwordHash){
        this.name=name;
        this.surname=surname;
        this.passwordHash=passwordHash;
        this.number=number;
    }
}
