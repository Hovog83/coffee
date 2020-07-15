package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String text = "For %s cups of coffee you will need:\n %s ml of water\n %s ml of milk\n %s g of coffee beans\n";
        Coffe coffe = new  Coffe();
        coffe.setCount(Integer.parseInt(input));
        String stringFormatConcat = String.format(text, input,coffe.getWaterCount(),coffe.getMilkCount(),coffe.getCoffeeCount());
        System.out.printf(stringFormatConcat);
        in.close();

    }

}

