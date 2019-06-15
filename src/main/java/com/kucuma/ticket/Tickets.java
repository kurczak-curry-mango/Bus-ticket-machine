package com.kucuma.ticket;

import java.util.Scanner;
public class Tickets extends  Ticket{
    static int number=0;
   public Tickets()
    {
        super();
    }

   public void addTickets(int index)
    {
        this.blist.add(tickets.get(index));
        System.out.println();
    };

   public void removeTickets()
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Podaj nr biletu który chcesz usunąć");
       int nr = scan.nextInt();
       this.blist.remove(nr);

   }

    public String bilety()
    {
        String name= " ";
        if(blist.size()==0)
            System.out.println("Nie wybrales zadnego biletu!!");
        else
        {
            for (Ticket ticket : blist) {
                name += ticket.type + "\n";
            }
        }
        return name;
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
                price += ticket.pricetopay;
                price=(double) Math.round(price*100)/100;
            }
        }
        return price;
    }
}
