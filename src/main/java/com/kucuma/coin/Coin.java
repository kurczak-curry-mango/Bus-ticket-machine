package com.kucuma.coin;


import java.util.LinkedList;

public class Coin {
    private double value=0; // wartosc
    private String name; //nazwa
    protected int coinId=1; //Id Monety
    protected LinkedList<Coin> coins=new LinkedList<>(); //rodzaje
    protected LinkedList<Coin> moneyThrowed =new LinkedList<>(); // wrzucone


    Coin(){ createCoinList();};

    Coin(String name, double value, int id ){
        this.name=name;
        this.value=value;
        this.coinId=id;
        this.coinId++;
    }

    void createCoinList(){
                    coins.add(new Coin("0.05 groszy", 0.05,coinId));
                    coins.add(new Coin("10 groszy", 0.1,coinId));
                    coins.add(new Coin("20 groszy", 0.2,coinId));
                    coins.add(new Coin("50 groszy", 0.5,coinId));
                    coins.add(new Coin( "1 złoty",1,coinId ));
                    coins.add(new Coin( "2 złoty",2,coinId ));
                    coins.add(new Coin( "5 złoty",5,coinId ));
                    coins.add(new Coin( "10 złoty",10,coinId ));
                    coins.add(new Coin( "20 złoty",20,coinId ));
                    coins.add(new Coin( "50 złoty",50,coinId ));
                    coins.add(new Coin( "100 złoty",50,coinId ));
    }



 //Gettes

    public LinkedList<Coin> getMoneyThrowed() {
        return moneyThrowed;
    }

    public LinkedList<Coin> getCoins() {
        return coins;
    }

    protected String getName() {
        return name;
    }

    protected double getValue() {
        return value;
    }

    protected int getCoinId() {
        return coinId;
    }

}
