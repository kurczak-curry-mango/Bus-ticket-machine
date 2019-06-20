package com.kucuma.coin;
import java.util.LinkedList;

public class PiggyBank{
    LinkedList<Coin> piggy = new LinkedList<>();

    public PiggyBank(){

        createRestList(piggy);

    };

    protected void createRestList(LinkedList<Coin> obj){

        obj.add(new Coin("10 groszy", 0.1,200));
        obj.add(new Coin("20 groszy", 0.2,200));
        obj.add(new Coin("50 groszy", 0.5,100));
        obj.add(new Coin( "1 złoty",1,100 ));
        obj.add(new Coin( "2 złoty",2,50 ));
        obj.add(new Coin( "5 złoty",5,10 ));
        obj.add(new Coin( "10 złoty",10,10 ));
        obj.add(new Coin( "20 złoty",20,10 ));
        obj.add(new Coin( "50 złoty",50,5 ));
        obj.add(new Coin( "100 złoty",100,0 ));
    }

     public void howMuchInPiggy()
    {
        for(Coin piggy : piggy)
            System.out.println(piggy.getCoinAmount());
    }

    void addingToPiggy(int[] tab)
    {
        try{
        int [] add = tab;
        for(int j = 0 ;j<piggy.size()-1;j++)
        {
          piggy.get(j).setCoinAmountI(add[j]);
        }
        }catch(IndexOutOfBoundsException e)
        {
            System.out.println("addingToPiggyERROR: Out of Bound!!!");
        }
    }

   public double countRest(double money, double price )
    {
        double rest=0;
        rest=money-price;
        return rest;
    }

    public void rest(double x) {
        int i =piggy.size()-1;
        int p;
        try {
            while (x > 0 && i>=0)       //dopoki redxta >0
            {
                if (x >= piggy.get(i).getValue())  //sprawdzsm dany nominal
                {
                    p = (int) Math.floor(x / (piggy.get(i).getValue()));   //ile razy dany
                    if (p > piggy.get(i).getCoinAmount())
                        p = piggy.get(i).getCoinAmount();
                    else
                        x = (double) Math.round(100 * (x - (piggy.get(i).getValue() * p))) / 100; //zmniejsz reszte o wydane
                    System.out.println(piggy.get(i).getValue() + "\tx\t" + p);
                    piggy.get(i).setCoinAmountMi(p);
                }
                i--;            //next nomial
            }
        }catch(IndexOutOfBoundsException e)
        { System.out.println("REST ERROR!!! Wyszedles poza granice!!");}
    }

  public  boolean buy(double money,double price,int []tab )
    {
        if(money>=price && money!=0)
        {
            rest(countRest(money,price));
            addingToPiggy(tab);
            return true;
        }

        else{
            System.out.println("Wrzuc wiecej pieniedz");
            return false;
        }
    }

}
