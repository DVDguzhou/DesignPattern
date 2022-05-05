package com.hlw.FactoryMethodPattern;

import com.hlw.FactoryMethodPattern.framework.Factory;
import com.hlw.FactoryMethodPattern.framework.Product;
import com.hlw.FactoryMethodPattern.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("tom");
        Product card2 = factory.create("mary");
        Product card3 = factory.create("tony");
        card2.use();
    }
}
