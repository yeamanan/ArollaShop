package com.arolla.jam.shop.bean;

import java.util.Currency;

public class CartPrice {

    private Currency currency;

    private double price;

    public CartPrice(double price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getPrice() {
        return price;
    }
}
