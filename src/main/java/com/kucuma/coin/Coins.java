package com.kucuma.coin;

import java.util.LinkedList;

public class Coins extends Coin{

    //zmienne
    private static int amountOfCoins=0; //licza monet wrzucanych limit
    private LinkedList<Coin> coins=new LinkedList<>(); //rodzaje
    private LinkedList<Coin> moneyThrowed =new LinkedList<>(); // wrzucone

    //konstruktor
    public Coins(){ createCoinList(coins); }

    //tworzenie listy obietkow Coin
    private void createCoinList(LinkedList<Coin> obj){
        //obj.add(new Coin("0.05 groszy", 0.05));
        obj.add(new Coin("10 groszy", 0.1));
        obj.add(new Coin("20 groszy", 0.2));
        obj.add(new Coin("50 groszy", 0.5));
        obj.add(new Coin( "1 złoty",1 ));
        obj.add(new Coin( "2 złoty",2 ));
        obj.add(new Coin( "5 złoty",5 ));
        obj.add(new Coin( "10 złoty",10 ));
        obj.add(new Coin( "20 złoty",20 ));
        obj.add(new Coin( "50 złoty",50 ));
        obj.add(new Coin( "100 złoty",50 ));
    }
    //dodwanie
    public void insertCoin(int inx) {
        try{
        if(amountOfCoins<200) {
            this.moneyThrowed.add(coins.get(inx));
            if(coins.get(inx).getValue() > 5)
                System.out.println("dodano monete " + coins.get(inx).getName());
            else
                System.out.println("dodano banknot " + coins.get(inx).getName());
            amountOfCoins++;
        }else
            System.out.println("Przekroczono już limit monet!!!");
    }catch (IndexOutOfBoundsException e){
            System.out.println("Bład w dodawaniu monet");
        }
    }
    //usuwanie monet
    public void removeCoins() {
        try {

            this.moneyThrowed.clear();
            amountOfCoins=0;
        }catch (IndexOutOfBoundsException e)
        {
            System.out.println("Nie ma juz monet");
        }
    }

    //Kwota Wrzucona do automatu
    public double howMuchmoney() {
        double cash=0;
        if(moneyThrowed.size()==0)
            System.out.println("Nie wrzuciłes żadnej monety!!");
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



    //gettery
    public LinkedList<Coin> getMoneyThrowed() { return moneyThrowed; }
    public LinkedList<Coin> getCoins() { return coins; }
}