package com.arolla.jam.shop;

public class Application {
    public static void main(String[] args) {
        ApplicationScope scope = new ApplicationScope(args);
        ApplicationMainHelper helper = ApplicationInjector.injectMainHelper(scope);
        helper.run();
    }
}
