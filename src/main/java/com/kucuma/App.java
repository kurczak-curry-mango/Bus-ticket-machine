package com.kucuma;
import com.kucuma.coin.*;
import com.kucuma.controller.WindowController;
import com.kucuma.ticket.Tickets;

/**
 * Hello world!
 *
 */
public class App extends PiggyBank
{
    public static void main( String[] args )
    {
        WindowController controller = new WindowController();
        controller.showWindowController();
    }
}
