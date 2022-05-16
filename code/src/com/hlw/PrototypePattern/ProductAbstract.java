package com.hlw.PrototypePattern;

import com.hlw.PrototypePattern.framework.Product;

public abstract class ProductAbstract implements Product {
    public abstract void use();

    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
