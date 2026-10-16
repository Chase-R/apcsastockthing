package com.example.template;

import java.util.ArrayList;

public class Person {
/*
vars to add later networth age
functions buy stock, sell stock, add stock, subtrac tsock, sget owned stocks, networth calc,
 */
    private String personName;
    private double cash;


    public Person(String name, double cash){
        this.personName = name;
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public String getPersonName() {
        return personName;
    }
}
