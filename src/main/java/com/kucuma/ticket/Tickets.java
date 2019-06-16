package com.kucuma.ticket;

import java.util.Scanner;
public class Tickets extends  Ticket{
   public Tickets()
    {
        super();
    }

   public void addTickets(int index)
    {
        boolean tmp=true;
        for(Ticket ticket : blist){
            if(ticket==tickets.get(index)){
                ticket.setTicketAmmount();
                //System.out.println("prawda!");
                tmp=false;
            }
        }
        if(tmp) {
            this.blist.add(tickets.get(index));
            System.out.println("dodano bilet " + index);
        }

        };

   public void removeTickets()
   {
       //Scanner scan = new Scanner(System.in);
       //System.out.println("Podaj nr biletu który chcesz usunąć");
       //int nr = scan.nextInt();
       try {
           this.blist.remove(blist.size()-1);
       }catch (IndexOutOfBoundsException e){
           System.out.println("Nie ma takiego indexu");
       }

   }

    public String bilety()
    {
        StringBuilder name= new StringBuilder();
        if(blist.size()==0)
            name.append("Nie wybrales zadnego biletu!!");
        else
        {   int number=1;
            //String format = "%2d %1$-30s %3d";
            String line=String.format("%3s %15s %15s\n", "Nr.", "Typ biletu", "ilosc") ;
            name.append(line);
            for (Ticket ticket : blist) {
                line= String.format("%2d. %-25s %-4d", number, ticket.type, ticket.TicketAmmount );
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
            System.out.println("Nie wybrales zadnego biletu!!");
        else
        {
            for (Ticket ticket : blist)
            {
                price += ticket.pricetopay*ticket.getTicketAmmount();
                price=(double) Math.round(price*100)/100;
            }
        }
        return price;
    }
}
