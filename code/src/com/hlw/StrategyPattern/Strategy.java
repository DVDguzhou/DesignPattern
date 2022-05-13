package com.hlw.StrategyPattern;

/**
 * 定义猜拳策略的抽象方法的接口
 */
public interface Strategy {

    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
