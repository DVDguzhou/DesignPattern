package com.hlw.FactoryMethodPattern.idcard;

import com.hlw.FactoryMethodPattern.framework.Product;

public class IDCard extends Product {

    private String owner;

    IDCard(String owner) {
        System.out.println("create " + owner + "'s IDCard");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("to use " + owner + "'s IDCard");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
