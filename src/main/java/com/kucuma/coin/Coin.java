package com.kucuma.coin;




 public class Coin {
    private double value; // wartosc
    private String name; //nazwa
    Coin(){ }
    Coin(String name, double value ){ this.name=name;this.value=value; }
 //Gettes
    protected String getName() { return name; }
    protected double getValue() { return value; }
//setter
    public void setName(String name) { this.name = name; }
    public void setValue(double value) { this.value = value; }

}
