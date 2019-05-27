package com.zipcodewilmington.scientificcalculator;

public class app {
    public static void main() {
        Console.println("Welcome to our Calculator");
        String help  = Console.getStringInput("For a list of commands type help otherwise press any key to continue");
        if(help.equals("help")){
            String helperFile = String.format("List of Commands: \n + is the operator for Addition\n - is the operator for Subtraction\n " +
                    "* is the operator for Mutiplication\n/ is the operator for Division\n" +
                    "r is the operator for Square Root\n ^ is the operator for exponents\n s is the operator for sin\n" +
                    "cs is the operator for CoSin\n t is the operator for Tangent\n is the operator for Inverse Sin\n ics is the operator for Inverse of CoSin\n " +
                    "it is the operator for Inverse Tangent\n f is the operator for Factorial");
            System.out.println(helperFile);
        }

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


