package com.arolla.jam.shop;

import com.arolla.jam.shop.service.CurrencyService;
import com.arolla.jam.shop.service.CurrencyServiceImpl;
import com.arolla.jam.shop.service.PriceService;
import com.arolla.jam.shop.service.PriceServiceImpl;

public class ApplicationInjector {
    public static ApplicationMainHelper injectMainHelper(ApplicationScope applicationScope) {
       return new ApplicationMainHelper(injectTotalPriceService(applicationScope));
    }

    public static PriceService injectTotalPriceService(ApplicationScope applicationScope) {
        return new PriceServiceImpl(injectCurrencyConvertor(applicationScope));
    }

    public static CurrencyService injectCurrencyConvertor(ApplicationScope applicationScope) {
        return new CurrencyServiceImpl();
    }
}