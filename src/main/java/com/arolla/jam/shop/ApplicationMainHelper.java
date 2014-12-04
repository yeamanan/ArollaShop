package com.arolla.jam.shop;

import com.arolla.jam.shop.bean.Cart;
import com.arolla.jam.shop.bean.Item;
import com.arolla.jam.shop.service.PriceService;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class ApplicationMainHelper {

    private PriceService totalpriceService;

    public ApplicationMainHelper(PriceService totalpriceService) {
        this.totalpriceService = totalpriceService;
    }

    public void run() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(15.0d, Currency.getInstance(Locale.UK)));
        items.add(new Item(55.0d, Currency.getInstance(Locale.UK)));
        items.add(new Item(105.0d, Currency.getInstance(Locale.US)));
        Cart cart = new Cart(items);
        cart.setCartPrice(totalpriceService.calculTotal(cart.getItems(), Currency.getInstance(Locale.US)));
        System.out.println(cart.getCartPrice().getCurrency());
        System.out.println(cart.getCartPrice().getPrice());
    }
}
