package com.arolla.jam.shop.service;

import java.util.Currency;

public interface CurrencyService {
    double convertPrice(double price, Currency startCurrency, Currency endCurrency);

    double getRate(Currency startCurrency, Currency endCurrency);
}
