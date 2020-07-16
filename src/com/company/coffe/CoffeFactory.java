package com.company.coffe;

public class CoffeFactory {
    //use getShape method to get object of type shape
    public Coffe getCoffe(String coffeType){

        if(coffeType == null){
            return null;
        }
        if(coffeType.equalsIgnoreCase("1")){
            return new Espresso();
        } else if(coffeType.equalsIgnoreCase("2")){
            return new Latte();
        } else if(coffeType.equalsIgnoreCase("3")){
            return new Cappuccino();
        }
        return null;
    }

}
