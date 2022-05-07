package com.hlw.PrototypePattern.framework;

public interface Product extends Cloneable{

    public abstract void use();

    public abstract Product createClone();
}
