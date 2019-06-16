package com.kucuma.coin;

public class Coins extends Coin{
static int amountOfCoins=0;
    Coins(){
        super();
    }

    void insertCoin(int inx) //dodwanie
    {
        if(amountOfCoins<200) {
            this.moneyThrowed.add(coins.get(inx));
            System.out.println("dodano bilet " + inx);
            amountOfCoins++;
        }else
            System.out.println("Przekroczono już limit monet!!!");
    }

    void removeCoins() //usuwanie
    {
            try {
               this.moneyThrowed.clear();
                amountOfCoins=0;
            }catch (IndexOutOfBoundsException e)
            {
                System.out.println("Nie ma juz monet");
            }
    }

    public String coinsInserted() //wyswietlanie wrzuconyhc moment
    {
        StringBuilder text= new StringBuilder();
        if(moneyThrowed.size()==0)
            text.append("Nie wrzucono żadnych monet!!");
        else
        {   int number=1;
            text.append("Wrzucono moonet: \n");
            for (Coin coin : moneyThrowed) {
                text.append(number).append(". ").append(coin.getName()).append("\n");
                number++;
            }
        }
        return text.toString();
    };

    double howMuchmoney()
    {
        double cash=0;
        if(moneyThrowed.size()==0)
            System.out.println("Nie wybrales zadnego biletu!!");
        else
        {
            for (Coin coin : moneyThrowed)
            {
                cash += coin.getValue();
                cash=(double) Math.round(cash*100)/100;
            }
        }
        return cash;
    }

}
