package com.arolla.jam.shop.bean;

import java.util.Currency;

public class Item {

    private double price;

    private Currency currency;

    public Item(double price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }
}
