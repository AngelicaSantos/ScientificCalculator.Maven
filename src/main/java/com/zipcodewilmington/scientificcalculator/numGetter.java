package com.zipcodewilmington.scientificcalculator;

public class numGetter {
    public Double firstNumgetter(){
        Operator sendFirstNum = new Operator();
        Double firstNum = Console.getDoubleInput("Enter number");
        String operator = Console.getStringInput("Enter operator");
        Double answer = sendFirstNum.getOperator(operator,firstNum);
        return answer;
    }
}
