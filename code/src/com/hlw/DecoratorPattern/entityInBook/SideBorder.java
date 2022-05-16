package com.hlw.DecoratorPattern.entityInBook;

/**
 * 用于只显示左右边框的类
 */
@SuppressWarnings({"all"})
public class SideBorder extends Border{

    private String borderChar;

    public SideBorder(Display display, String borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
