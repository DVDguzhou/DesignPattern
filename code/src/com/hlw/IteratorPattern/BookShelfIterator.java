package com.hlw.IteratorPattern;

import com.hlw.IteratorPattern.Interfaces.Iterator;

@SuppressWarnings({"all"})
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLenth()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookByIndex(index);
        index++;
        return book;
    }
}
