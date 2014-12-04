package com.arolla.jam.shop.bean;

import java.util.List;

public class Cart {

    private List<Item> items;

    private CartPrice cartPrice;

    public Cart(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public CartPrice getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(CartPrice cartPrice) {
        this.cartPrice = cartPrice;
    }
}
