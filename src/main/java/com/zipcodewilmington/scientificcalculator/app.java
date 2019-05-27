package com.zipcodewilmington.scientificcalculator;

public class app {
    public static void main() {
        Console.println("Welcome to my calculator!");
        boolean runCheck = true;
        numGetter numClass = new numGetter();
        boolean storeNum = false;
        Double storage =0.0;
        while (runCheck) {
                if(storeNum== false) {
                    storage = numClass.firstNumgetter();
                }
                String statusCheck = Console.getStringInput("Press q to quit or the any key to continue");
                if (statusCheck.equals("q")) {
                    System.out.println("Goodbye");
                    runCheck = false;
                }else if(statusCheck.equals("k")){
                    storeNum = true;
                    System.out.println(storage);
                } else {

                    continue;
                }
            }
        }
    }


