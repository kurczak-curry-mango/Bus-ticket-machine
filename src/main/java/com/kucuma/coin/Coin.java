package com.kucuma.coin;




 public class Coin {
    private double value; // wartosc
    private String name; //nazwa
     private int coinAmount;
    Coin(){ }
    Coin(String name, double value, int coinAmount ){
        this.name=name;
        this.value=value;
        this.coinAmount=coinAmount;
    }
 //Gettes
    protected String getName() { return name; }
    protected double getValue() { return value; }
    public int getCoinAmount() { return coinAmount; }

//setter
     void setName(String name) { this.name = name; }
     void setValue(double value) { this.value = value; }
     void setCoinAmount() { this.coinAmount+=1; }
     void setCoinAmountM(int i) { this.coinAmount-=1; }
     void setCoinAmountMi(int i) { this.coinAmount-=i; }
     void setCoinAmountI(int i) { this.coinAmount+=i; }
 }