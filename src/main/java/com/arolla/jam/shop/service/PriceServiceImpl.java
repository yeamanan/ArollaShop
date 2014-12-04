package com.arolla.jam.shop.service;

import com.arolla.jam.shop.bean.CartPrice;
import com.arolla.jam.shop.bean.Item;

import java.util.Currency;
import java.util.List;

public class PriceServiceImpl implements PriceService {

    private CurrencyService service;

    public PriceServiceImpl(CurrencyService service) {
        this.service = service;
    }

    @Override
    public CartPrice calculTotal(List<Item> cartItems, Currency currency) {
        double total=0;
        for( Item item: cartItems) {
            if (currency.equals(item.getCurrency())) {
                total += item.getPrice();
            } else {
                total += service.convertPrice(item.getPrice(), item.getCurrency(), currency);
            }
        }
        return new CartPrice(total, currency);
    }
}
