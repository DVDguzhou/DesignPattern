package com.hlw.DecoratorPattern.entityInBook;

/**
 * 用于显示字符串的抽象类
 */
@SuppressWarnings({"all"})
public abstract class Display {
    //获取横向字符数
    public abstract int getColumns();

    //获取纵向行数
    public abstract int getRows();

    //获取第row行的字符串
    public abstract String getRowText(int row);

    //显示全部
    public final void show() {
        for(int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
