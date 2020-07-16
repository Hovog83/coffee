package com.company;

import com.company.coffe.Coffe;
import com.company.coffe.CoffeFactory;
import com.company.coffe.CoffeResurs;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main.cmd(in);
    }
    public static void cmd(Scanner in){
        System.out.println("Write action (buy, fill, take)");
        String input = in.nextLine();
        if(input.equals("buy")){
            buy(in);
        }else if(input.equals("fill")){
            fill(in);
        }else if (input.equals("take") ){
            take(in);
        }else{
            System.out.println("false");
        }
    }

    public static void buy(Scanner in)  {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
        String input = in.nextLine();
        CoffeFactory coffeFactory = new CoffeFactory();
        Coffe coffetype = coffeFactory.getCoffe(input);
        CoffeResurs coffe = new CoffeResurs();
        coffetype.draw(coffe);
        coffe.printCoffeResurs();
//        Main.cmd(in);
    }
    public static void fill(Scanner in) {
        CoffeResurs coffe = new CoffeResurs();
        HashMap<String, Integer> resurs = coffe.getCoffeeResurs();

        System.out.println("Write how many ml of water do you want to add:");
        String water = in.nextLine();
        coffe.setResurs("water",resurs.get("water")+Integer.parseInt(water));

        System.out.println("Write how many ml of milk do you want to add:");
        String milk = in.nextLine();
        coffe.setResurs("milk",resurs.get("milk")+Integer.parseInt(milk));

        System.out.println("Write how many grams of coffee beans do you want to add:");
        String coffee = in.nextLine();
        coffe.setResurs("coffee",resurs.get("coffee")+Integer.parseInt(coffee));

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        String cups = in.nextLine();
        coffe.setResurs("cups",resurs.get("cups")+Integer.parseInt(cups));

        coffe.printCoffeResurs();
    }
    public static void take(Scanner in) {
        CoffeResurs coffe = new CoffeResurs();
        HashMap<String, Integer> resurs = coffe.getCoffeeResurs();
        System.out.println("I gave you "+resurs.get("money"));
        coffe.setResurs("money",0);
        coffe.printCoffeResurs();
    }
}

