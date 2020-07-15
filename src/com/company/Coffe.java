package com.company;

public class Coffe {

    private  Integer water = 200;
    private  Integer milk = 50;
    private  Integer coffee = 15;
    private  Integer count;

    public  void setCount(Integer count) {
        this.count = count;
    }
    public  int getWaterCount() {
        return  this.count*water;
    }

    public  int getMilkCount() {
        return  this.count * milk;
    }

    public  int getCoffeeCount() {
        return  this.count*coffee;
    }

}
