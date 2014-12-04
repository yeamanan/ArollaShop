package com.arolla.jam.shop.service;

import java.util.Currency;

public class CurrencyServiceImpl implements CurrencyService {
    @Override
    public double convertPrice(double price, Currency startCurrency, Currency endCurrency) {
        return price * getRate(startCurrency, endCurrency);
    }

    @Override
    public double getRate(Currency startCurrency, Currency endCurrency) {
        return (1 / Math.random()) / 2;
    }
}
