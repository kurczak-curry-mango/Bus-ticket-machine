package com.kucuma.ticket;

import java.util.LinkedList;


public class Ticket   {

    public double pricetopay;
    public String type;
    public LinkedList<Ticket> blist = new LinkedList<Ticket>();
    public LinkedList<Ticket> tickets = new LinkedList<Ticket>();
    String bought = "";


    Ticket()
    {
        createTicketTable();
    };

    Ticket(double pricetopay, String type)
    {
        this.pricetopay=pricetopay;
        this.type=type;


    };

    LinkedList<Ticket> createTicketTable()
    {

        tickets.add(new Ticket(2.0, " Bilet normalny 20 min"));
        tickets.add(new Ticket(1.4, " Bilet ulgowy 20 min"));
        tickets.add(new Ticket(3.0, " Bilet normalny 40 min"));
        tickets.add(new Ticket(1.9, " Bilet ulgowy 20 min"));
        tickets.add(new Ticket(5.0, " Bilet normalny 60 min "));
        tickets.add(new Ticket(3.0, " Bilet ulgowy 60 min"));
        tickets.add(new Ticket(15.0, " Bilet normalny 24"));
        tickets.add(new Ticket(7.5, " Bilet ulgowy 24h"));
        tickets.add(new Ticket(24.0, " Bilet normalny 48h"));
        tickets.add(new Ticket(12.0, " Bilet ulgowy 48h"));
        return tickets;

    };



    public double getPricetopay() {
        return pricetopay;
    };

    public String getType() {
        return type;
    };

    public LinkedList<Ticket> getBlist() {
        return blist;
    };

    public LinkedList<Ticket> getTickets() {
        return tickets;
    };


}
