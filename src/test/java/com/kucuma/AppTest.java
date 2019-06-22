package com.kucuma;

import static org.junit.Assert.assertTrue;

import com.kucuma.coin.Coin;
import com.kucuma.coin.Coins;
import com.kucuma.coin.PiggyBank;
import com.kucuma.ticket.Tickets;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * Rigorous Test :-)
     */

    @Test
    public void shouldAnswerWithTruee(){
        Coins coins = new Coins();
        coins.insertCoin(5);
        coins.insertCoin(1);
        Assert.assertTrue(coins.howMuchmoney()==5.2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrownIndexOutOfBound(){
        Coins coins = new Coins();
        coins.insertCoin(14);
    }
    @Test
    public void assertNotSame()
    {
        Coins coins = new Coins();
        PiggyBank piggy = new PiggyBank();
        Assert.assertNotSame("Te same obiekty " , coins, piggy);
    }

    @Test
    public void getValueTest()
    {
        Tickets ticket = new Tickets();
        ticket.getTickets().get(3).getPricetopay();
        Assert.assertTrue(ticket.getTickets().get(3).getPricetopay()==1.9);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void execeptionRemoveTicket()
    {
        Tickets ticket = new Tickets();
        ticket.removeTickets();
    }


}
