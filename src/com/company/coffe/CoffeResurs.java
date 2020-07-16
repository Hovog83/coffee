package com.company.coffe;

import java.util.HashMap;

public class CoffeResurs {

    private HashMap<String, Integer> resurs = new HashMap<String, Integer>();;

    public CoffeResurs(){
        this.resurs.put("water", 400);
        this.resurs.put("milk", 540);
        this.resurs.put("coffee", 120);
        this.resurs.put("cups", 9);
        this.resurs.put("money", 550);
    }
    public void setResurs(String key, Integer value) {
        this.resurs.put(key, value);
    }
    public HashMap<String, Integer> getCoffeeResurs() {
        return this.resurs;
    }

    public void printCoffeResurs() {
        String text = "The coffee machine has:\n  %s of water\n  %s of milk\n  %s of coffee beans\n  %s of disposable cups\n  %s of money\n";
        String stringFormatConcat = String.format(text,this.resurs.get("water"),this.resurs.get("milk"), this.resurs.get("coffee"), this.resurs.get("cups"), this.resurs.get("money"));
        System.out.println(stringFormatConcat);
    }
}
