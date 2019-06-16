package com.kucuma.coin;


import java.util.LinkedList;

public class Coin {
    static int counter=0; //zliczanie ilosci
    private double value=0; // wartosc
    private String name; //nazwa
    public LinkedList<Coin> coins=new LinkedList<>(); //rodzaje
    public LinkedList<Coin> coinsthrowed=new LinkedList<>(); // wrzucone

    Coin(){ createCoinList();};

    Coin(String name, double value ){
        this.name=name;
        this.value=value;
    }
    Coin(int value, String name ){
        this.name=name;
        this.value=value;
    }

    void createCoinList(){
                    coins.add(new Coin("0.05 groszy", 0.05));
                    coins.add(new Coin("10 groszy", 0.1));
                    coins.add(new Coin("20 groszy", 0.2));
                    coins.add(new Coin("50 groszy", 0.5));
                    coins.add(new Coin( 1, "1 złoty"));
                    coins.add(new Coin( 2, "2 złoty"));
                    coins.add(new Coin( 5, "5 złoty"));
                    coins.add(new Coin( 10, "10 złoty"));
                    coins.add(new Coin( 20, "20 złoty"));
        }

 //Gettery

    public LinkedList<Coin> getCoinsthrowed() {
        return coinsthrowed;
    }

    public LinkedList<Coin> getCoins() {
        return coins;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
    public static int getCounter() {
        return counter;
    }

}
