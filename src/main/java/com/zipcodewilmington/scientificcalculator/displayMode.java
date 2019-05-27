package com.zipcodewilmington.scientificcalculator;

public class displayMode {
    public static String display(double answer) {
        String answer = "Test";

        Double d = new Double(100.5);
        Integer dubInt = d.intValue();



        int display = 1;



        switch (display) {
            case 1:
                answer = Integer.toHexString(dubInt);
                break;
            case 2:
                answer = Integer.toBinaryString(dubInt);
                break;
            case 3:
                answer = Integer.toOctalString(dubInt);
                break;
            default:
            case 4:
                answer = d.toString();
                break;
        }
        System.out.println(answer);
        return answer;
    }
}
