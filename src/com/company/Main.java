package com.company;

public class Main {

    public static void main(String[] args) {
        String[] cmdArray =  {"Starting to make a coffee", "Grinding coffee beans", "Boiling water", "Mixing boiled water with crushed coffee beans", "Pouring coffee into the cup", "Pouring some milk into the cup", "Coffee is ready!"};
        for (int i = 0; i < cmdArray.length; i++) {
            int delay = 1500*(i+1);
            String cmd = cmdArray[i];
            setTimeout(() -> System.out.println(cmd),delay);
        }
    }
    public static void setTimeout(Runnable runnable, int delay){
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            }
            catch (Exception e){
                System.err.println(e);
            }
        }).start();
    }
}

