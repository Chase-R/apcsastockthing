package com.example.template;

import java.util.ArrayList;

public class Manager {

    private ArrayList<Person> people = new ArrayList<>();
    private ArrayList<Stock> stocksAvaliable = new ArrayList<>();

    public  Manager(){

    }

    public void addPerson(String lastname, String firstname, double cash){
        String tempname = lastname + ", " + firstname;
        people.add(new Person(tempname, cash));

    }
    public void addStok(String name, double price){
        stocksAvaliable.add(new Stock(name, price));
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public ArrayList<Stock> getStocksAvaliable() {
            return stocksAvaliable;
    }
}
