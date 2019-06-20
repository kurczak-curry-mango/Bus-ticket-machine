package com.kucuma.ticket;

import com.kucuma.StringHandler;

import java.util.ArrayList;
import java.util.Scanner;


public class Tickets extends  Ticket{
   public Tickets()
    {
        super();
    }

    public void changeticketlangENG(){
        for(Ticket ticket : blist){
            ticket.type=language.get(ticket.typeID);
        }

    }

    public void changeticketlangPL(){
        for(Ticket ticket : blist){
            ticket.type=language.get(ticket.typeID);
        }
    }
    public void changeticketlangDE(){
        for(Ticket ticket : blist){
            ticket.type=language.get(ticket.typeID);
        }
    }
   public void addTickets(int index)
    {
        boolean tmp=true;
        for(Ticket ticket : blist){
            if(ticket==tickets.get(index)){
                ticket.setTicketAmmount();
                ticketsInCart.add(ticket.getTypeID());
                //System.out.println("prawda!");
                tmp=false;
                break;
            }

        }
        if(tmp) {
            this.blist.add(tickets.get(index));
            ticketsInCart.add(tickets.get(index).getTypeID());
            System.out.println("dodano bilet " + index);
        }
        changeticketlangENG();
        };

   public void removeAllTickets(){
       try {
           if(blist.size()>0){
              blist.clear();
           }
           else System.out.println("nie ma biletu");
       }catch (IndexOutOfBoundsException e){
           System.out.println("Nie ma takiego indexu");
       }
   }
   public void removeTickets()
   {
       //Scanner scan = new Scanner(System.in);
       //System.out.println("Podaj nr biletu który chcesz usunąć");
       //int nr = scan.nextInt();
       try {
           System.out.println(ticketsInCart);
           if(blist.size()>0){
           //blist.getLast().setTicketAmmountM();
           for(Ticket ticket: blist){
               if(ticket.getTypeID()==(ticketsInCart.getLast())&&ticket.getTicketAmmount()>1){
                   ticket.setTicketAmmountM();
                   ticketsInCart.removeLast();
                   break;
               }
               else if(ticket.getTypeID()==(ticketsInCart.getLast())&&ticket.getTicketAmmount()==1){
                   blist.remove(ticket);
                   ticketsInCart.removeLast();
                   break;
               }
           }
           }
           else System.out.println("nie ma biletu");
       }catch (IndexOutOfBoundsException e){
           System.out.println("Nie ma takiego indexu");
       }

   }

    public String ticketString()
    {
        StringBuilder name= new StringBuilder();
        if(blist.size()==0)
            name.append(language.get(13));
        else
        {   int number=1;
            //String format = "%2d %1$-30s %3d";
            String line=String.format("%3s %15s %15s\n", "Nr.", "Typ biletu", "ilosc") ;
            name.append(line);
            for (Ticket ticket : blist) {
                line= String.format("%2d. %-22s %-4d", number, ticket.type, ticket.TicketAmmount );
                //System.out.println(line);
                name.append(line).append("\n");
                number++;
            }
        }
        return name.toString();
    };

     public double priceFinal()
    {
        double price=0;
        if(blist.size()==0)
        {System.out.println("Nie wybrales zadnego biletu!!");}
        else{


        {
            for (Ticket ticket : blist)
            {
                price += ticket.pricetopay*ticket.getTicketAmmount();
                price=(double) Math.round(price*100)/100;
            }
        }}
        return price;
    }
};
