package com.hlw.DecoratorPattern.entityInBook;

/**
 * 只显示上下左右边框的类
 */
@SuppressWarnings({"all"})
public class FullBorder extends Border{

    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        }else if(row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        }else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    //生成一个重复count次数的字符ch的字符串
    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for(int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
