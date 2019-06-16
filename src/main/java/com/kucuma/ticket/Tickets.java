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
        System.out.println("dodano bilet "+index);
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
            name.append("Wybrano bilety: \n");
            for (Ticket ticket : blist) {
                name.append(number).append(". ").append(ticket.type).append("\n");
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
                price += ticket.pricetopay;
                price=(double) Math.round(price*100)/100;
            }
        }
        return price;
    }
}
