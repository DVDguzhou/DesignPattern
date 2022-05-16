package com.hlw.DecoratorPattern.entityInBook;

/**
 * 用于显示装饰边框的抽象类
 */
@SuppressWarnings({"all"})
public abstract class Border extends Display{

    //表示被装饰物
    protected Display display;

    //在生成实例时使用参数指定被装饰物
    protected Border(Display display) {
        this.display = display;
    }
}
