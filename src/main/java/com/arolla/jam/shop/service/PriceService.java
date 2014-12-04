package com.arolla.jam.shop.service;

import com.arolla.jam.shop.bean.CartPrice;
import com.arolla.jam.shop.bean.Item;

import java.util.Currency;
import java.util.List;

public interface PriceService {
    CartPrice calculTotal(List<Item> cartItems , Currency currency );
}
