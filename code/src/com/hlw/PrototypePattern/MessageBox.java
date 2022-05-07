package com.hlw.PrototypePattern;

import com.hlw.PrototypePattern.framework.Product;

public class MessageBox implements Product {

    private String name;

    public MessageBox(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("MessageBox: " + name);
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
