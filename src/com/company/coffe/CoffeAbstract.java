package com.company.coffe;

import java.util.HashMap;

abstract class CoffeAbstract {

    private Integer water = 200;
    private Integer milk = 100;
    private Integer coffee = 12;
    private Integer money = 6;

    public void draw(CoffeResurs coffe)  {
        HashMap<String, Integer> resurs = coffe.getCoffeeResurs();
        coffe.setResurs("water",resurs.get("water")-this.water);
        coffe.setResurs("milk",resurs.get("milk")-this.milk);
        coffe.setResurs("coffee",resurs.get("coffee")-this.coffee);
        coffe.setResurs("money",resurs.get("money")+this.coffee);
    }



}
