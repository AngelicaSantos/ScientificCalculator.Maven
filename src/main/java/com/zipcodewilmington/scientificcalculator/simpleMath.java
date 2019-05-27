package com.zipcodewilmington.scientificcalculator;

public class  simpleMath {
    simpleMath() {

    }

    public static Double add(Double a, Double b) {
        return a + b;
    }

    public static Double subtract(Double a, Double b) {
        return a - b;
    }

    public static Double multiply(Double a, Double b) {
        return a * b;
    }
    public static Double divide(Double a, Double b) {
        if (b == 0) {
            System.out.println("Error! Diving by zero is not allowed.");
            return 0.0;
        } else {
            return a / b;
        }
    }

        public Double modulo(Double a, Double b){
            if (b == 0) {
                System.out.println("Error! Dividing by zero is not allowed.");

                return 0.0;
            } else {
                return a % b;
            }
        }
    }
