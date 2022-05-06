package com.hlw.SingletonPattern.TickerMaker;

public class TicketMakerSingleton {

    private static final TicketMakerSingleton ticketMaker = new TicketMakerSingleton();

    private int ticket = 1000;

    private TicketMakerSingleton() {

    }

    public int getNextTickerNumber() {
        return ticket++;
    }

    public static TicketMakerSingleton getInstance() {
        return ticketMaker;
    }
}
