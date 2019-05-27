package com.zipcodewilmington.scientificcalculator;

public class Shapes {
    public static void getArea() {

        int choice = Console.getIntegerInput("Which shape? (Enter 1 for circle, 2 for square, 3 for triangle)");
        double area = 0;


        switch (choice) {
            case 1:
                Double radius = Console.getDoubleInput("Radius?");
                area = radius * radius * Math.PI;
                break;
            case 2:
                Double length = Console.getDoubleInput("Length?");
                Double width = Console.getDoubleInput("Width?");
                area = length * width;
                break;
            case 3:
                Double base = Console.getDoubleInput("Base?");
                Double height = Console.getDoubleInput("Height?");
                area = (base * height) / 2;
                break;
            default:
            case 4:
                System.out.println("Invalid choice");
                app.main();
                break;
        }
        System.out.println("The area is " + area);
        app.main();
    }


    }

