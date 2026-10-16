package com.example.template;

import java.lang.invoke.StringConcatException;
import java.util.ArrayList;

public class Stock {
    /* vars total amount, trend ,news, ipo
    functions chnge price, chnag amount
    */
    private String stockname;
    private double price;
    public Stock(String stockname, double price){
        this.stockname = stockname;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getStockname() {
        return stockname;
    }
}
