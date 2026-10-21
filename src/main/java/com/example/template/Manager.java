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
    public String buyStock(Person personbuy, Stock stockbuy, int numshares){
//        if(personbuy.getCash() >= stockbuy.getPrice() *numshares){
//            boolean ownstockalready = false;
//            for (int i=0; i <; i++ ){
//                if (){
//                    ownstockalready=true;
//                }
//            }
//            if (ownstockalready){
//                //add to shares
//            }else {
//                //new pbeject
//            }
//        }
        return personbuy.buyStock(stockbuy,numshares);

    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public ArrayList<Stock> getStocksAvaliable() {
            return stocksAvaliable;
    }
}
