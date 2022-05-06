package com.hlw.SingletonPattern.TickerMaker;

public class Main {

    public static void main(String[] args) {
        TicketMakerSingleton ticketMaker1 = TicketMakerSingleton.getInstance();
        TicketMakerSingleton ticketMaker2 = TicketMakerSingleton.getInstance();

        System.out.println(ticketMaker1.getNextTickerNumber());
        System.out.println(ticketMaker2.getNextTickerNumber());
    }
}
