package com.zipcodewilmington.scientificcalculator;

public class displayMode {
    public static String display(double answer) {
        String answr = "Test";

        Double d = new Double(100.5);
        Integer dubInt = d.intValue();



        int display = 1;



        switch (display) {
            case 1:
                answr = Integer.toHexString(dubInt);
                break;
            case 2:
                answr = Integer.toBinaryString(dubInt);
                break;
            case 3:
                answr = Integer.toOctalString(dubInt);
                break;
            default:
            case 4:
                answr = d.toString();
                break;
        }
        System.out.println(answr);
        return answr;
    }
}
