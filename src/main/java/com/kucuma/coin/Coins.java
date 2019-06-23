package com.kucuma.coin;

import java.util.LinkedList;

public class Coins extends Coin{

    //zmienne
    private static int amountOfCoins=0; //licza monet wrzucanych limit
    private LinkedList<Coin> coins=new LinkedList<>(); //rodzaje
    private LinkedList<Coin> moneyThrowed =new LinkedList<>(); // wrzucone
    private int [] tab = new int[9]; //tablica z wrzuconymi monetami
    //konstruktor
    public Coins(){ createCoinList(coins); }

    //tworzenie listy obietkow Coin
    protected void createCoinList(LinkedList<Coin> obj){
        //obj.add(new Coin("0.05 groszy", 0.05));
        obj.add(new Coin("10 groszy", 0.1,0));
        obj.add(new Coin("20 groszy", 0.2,0));
        obj.add(new Coin("50 groszy", 0.5,0));
        obj.add(new Coin( "1 złoty",1,0 ));
        obj.add(new Coin( "2 złoty",2,0 ));
        obj.add(new Coin( "5 złoty",5,0 ));
        obj.add(new Coin( "10 złoty",10,0 ));
        obj.add(new Coin( "20 złoty",20,0 ));
        obj.add(new Coin( "50 złoty",50,0 ));
        obj.add(new Coin( "100 złoty",100,0 ));
    }
    //dodwanie
    public void insertCoin(int inx) {
        if(inx<0 || inx >coins.size()-1)
            throw new IndexOutOfBoundsException("Bad range!!");
        try{
        if(amountOfCoins<200) {
            this.moneyThrowed.add(coins.get(inx));
            if(coins.get(inx).getValue() < 5){
               // System.out.println("dodano monete " + coins.get(inx).getName());
                }
            else
            {}// System.out.println("dodano banknot " + coins.get(inx).getName());
            amountOfCoins++;
            coins.get(inx).setCoinAmount();
        }else
        {}//System.out.println("Przekroczono już limit monet!!!");
    }catch (IndexOutOfBoundsException e){
            System.out.println("Bład w dodawaniu monet");
        }
    }
    //usuwanie monet
    public void removeCoins() {
        try {
           // System.out.println("Zwrócono \t" + howMuchmoney());
            this.moneyThrowed.clear();
            for(Coin coins : coins)
                coins.setCoinAmountI(1);
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
        {}// System.out.println("Nie wrzuciłes żadnej monety!!");
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

    //ilosc poszczególnych monet wrzuconych
    public void amountArray()
    {

        for(int i = 0;i<coins.size()-1;i++)
        {
            tab[i]=coins.get(i).getCoinAmount();
        }

    }

    //gettery
    public LinkedList<Coin> getMoneyThrowed() { return moneyThrowed; }
    public LinkedList<Coin> getCoins() { return coins; }
    public int[] getTab() { return tab; }

    public void setTab(int[] tab) { this.tab = tab; }
}