package com.hlw.FactoryMethodPattern.idcard;

import com.hlw.FactoryMethodPattern.framework.Factory;
import com.hlw.FactoryMethodPattern.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();
    private Map<String, Integer> map = new HashMap<>();

    private static int index = 0;
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        String owner = ((IDCard) product).getOwner();
        owners.add(owner);
        map.put(owner, index++);
        System.out.println(map);
    }
}
