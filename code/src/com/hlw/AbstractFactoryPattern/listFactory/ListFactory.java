package com.hlw.AbstractFactoryPattern.listFactory;

import com.hlw.AbstractFactoryPattern.factory.Factory;
import com.hlw.AbstractFactoryPattern.factory.Factory;
import com.hlw.AbstractFactoryPattern.factory.Link;
import com.hlw.AbstractFactoryPattern.factory.Page;
import com.hlw.AbstractFactoryPattern.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
