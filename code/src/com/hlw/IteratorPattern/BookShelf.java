package com.hlw.IteratorPattern;

import com.hlw.IteratorPattern.Interfaces.Aggregate;
import com.hlw.IteratorPattern.Interfaces.Iterator;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class BookShelf implements Aggregate {
    private ArrayList<Book> list;
    private int last;

    public BookShelf() {
        list = new ArrayList<>();
        last = 0;
    }

    public Book getBookByIndex(int index) {
        return list.get(index);
    }

    public void appendBook(Book book) {
        list.add(book);
        last++;
    }

    public int getLenth() {
        return last;
    }

    @Override
    public Iterator createIterator() {
        return new BookShelfIterator(this);
    }
}
