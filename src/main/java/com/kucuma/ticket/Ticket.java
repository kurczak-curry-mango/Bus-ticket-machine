package com.kucuma.ticket;

import java.util.LinkedList;


public class Ticket   {

    public double pricetopay; // cena biletow
    public String type; //rodzaj biletu
    public LinkedList<Ticket> blist = new LinkedList<Ticket>(); //lista biletów w koszyku
    public LinkedList<Ticket> tickets = new LinkedList<Ticket>(); // lista wszystkich dostepnyh koszuków
    //String bought = ""; nie wiem wiec zakomentowałem


    Ticket()
    {
        createTicketTable();
    };

    private Ticket(double pricetopay, String type)
    {
        this.pricetopay=pricetopay;
        this.type=type;


    };

    private void createTicketTable()
    {
        //inicjalizacja wszystkich biletów
        tickets.add(new Ticket(2.8, " Bilet normalny 20 min"));
        tickets.add(new Ticket(1.4, " Bilet ulgowy 20 min"));
        tickets.add(new Ticket(3.8, " Bilet normalny 40 min"));
        tickets.add(new Ticket(1.9, " Bilet ulgowy 40 min"));
        tickets.add(new Ticket(6.0, " Bilet normalny 60 min "));
        tickets.add(new Ticket(3.0, " Bilet ulgowy 60 min"));
        tickets.add(new Ticket(15.0, " Bilet normalny 24"));
        tickets.add(new Ticket(7.5, " Bilet ulgowy 24h"));
        tickets.add(new Ticket(24.0, " Bilet normalny 48h"));
        tickets.add(new Ticket(12.0, " Bilet ulgowy 48h"));

    };


    //zwraca kwote do zapłaty
    public double getPricetopay() {
        return pricetopay;
    };

    //zwraca
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
