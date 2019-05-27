package com.zipcodewilmington.scientificcalculator;

public class displayMode {
    public static String display(Double dub, int mode) {
        String answr = "Test";

        Integer dubInt = dub.intValue();



        int choice = mode;



        switch (choice) {
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
                answr = dub.toString();
                break;
        }
        return answr;
    }
}
