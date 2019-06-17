package com.kucuma;
import com.kucuma.coin.Coins;
import com.kucuma.controller.WindowController;
import com.kucuma.ticket.Tickets;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WindowController controller = new WindowController();
        controller.showWindowController();
//        Tickets t = new Tickets();
//        System.out.println(t.tickets.get(2).getPricetopay());
//        t.addTickets(2);
//        t.addTickets(5);
//        t.addTickets(1);
//        t.removeTickets();
//        System.out.println(t.priceFinal() + t.bilety());

    }
}
