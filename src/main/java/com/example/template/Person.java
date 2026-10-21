package com.example.template;

import java.util.ArrayList;

public class Person {
/*
vars to add later networth age
functions buy stock, sell stock, add stock, subtrac tsock, sget owned stocks, networth calc,
 */
    private String personName;
    private double cash;
    private ArrayList<IndividualStocksOwned> myStocks = new ArrayList<>();



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

    public ArrayList<IndividualStocksOwned> getMyStocks() {
        return myStocks;
    }

    public String buyStock(Stock stockbuy, int numshares){
        if(cash >stockbuy.getPrice() *numshares){
            cash -= stockbuy.getPrice() *numshares;
            IndividualStocksOwned temp = ownstock(stockbuy);

                if (temp == null) {
                    myStocks.add(new IndividualStocksOwned(stockbuy, numshares));
                    return "bought a new stock" + myStocks.getLast().getSharesOwned();

                }else {
                    temp.addstock(numshares);
                    return "bought more of a stock" + temp.getSharesOwned();
            }

        }
        return "no money";
    }

    public IndividualStocksOwned ownstock( Stock stockbuy){
        IndividualStocksOwned temp = null;

        for (int i=0; i <myStocks.size(); i++ ) {
            if (myStocks.get(i).getStock().equals(stockbuy)) {
                temp = myStocks.get(i);
            }
        }
        return temp;
    }


}
