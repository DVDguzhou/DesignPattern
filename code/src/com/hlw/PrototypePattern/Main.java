package com.hlw.PrototypePattern;

import com.hlw.PrototypePattern.framework.Manager;
import com.hlw.PrototypePattern.framework.Product;

import java.lang.Cloneable;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        MessageBox messageBox = new MessageBox("la");

        manager.register("la", messageBox);

        Product p = manager.create("la");
        p.use();
    }
}
