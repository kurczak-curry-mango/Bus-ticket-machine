package com.kucuma.coin;

public class Coins extends Coin{

    Coins(){
        super();
    }

    void insertCoin(int inx) //dodwanie
    {
        this.coinsthrowed.add(coins.get(inx));
        System.out.println("dodano bilet "+inx);
    }

    void removeCoin() //usuwanie
    {
            try {
                this.coinsthrowed.remove(coinsthrowed.size()-1);
            }catch (IndexOutOfBoundsException e)
            {
                System.out.println("Nie ma takiego indexu");
            }
    }

    void coinsIntoMachine(){

    }

}
