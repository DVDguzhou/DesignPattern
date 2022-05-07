package com.hlw.PrototypePattern.framework;

import com.hlw.PrototypePattern.framework.Product;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String pName, Product proto) {
        showcase.put(pName, proto);
    }

    public Product create(String pName) {
        Product p = showcase.get(pName);
        return p.createClone();
    }
}
