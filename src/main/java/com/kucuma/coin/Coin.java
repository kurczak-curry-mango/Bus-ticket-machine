package com.kucuma.coin;


import com.kucuma.StringHandler;

import java.util.ArrayList;

public class Coin {
    private double value; // wartosc
    private String name; //nazwa
     private int coinAmount;
     private StringHandler stringHandler = new StringHandler();
     public ArrayList<String> language= new ArrayList<>();
    Coin(){ language=stringHandler.getPolish();}
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