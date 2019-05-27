package com.zipcodewilmington.scientificcalculator;

public class numGetter {
    public Double firstNumgetter(){
        Double answer =0.0;
        try {
            Operator sendFirstNum = new Operator();
            Double firstNum = Console.getDoubleInput("Enter number");
            String operator = Console.getStringInput("Enter operator");
            answer = sendFirstNum.getOperator(operator, firstNum);
        }catch(Exception e){
            System.out.println("Numbers Only Please");
        }
        finally{
            return answer;
        }
    }
}
