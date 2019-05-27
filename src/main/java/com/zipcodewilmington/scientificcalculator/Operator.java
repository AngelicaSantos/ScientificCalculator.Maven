package com.zipcodewilmington.scientificcalculator;

public class Operator {
    numGetter numClass = new numGetter();

    public  Double getOperator(String operator,Double firstNum)

    {Double answer = 0.0;


        if(operator.equals("+")){
            Double secondNum = Console.getDoubleInput("Enter Second number");
            answer = simpleMath.add(firstNum,secondNum);


            System.out.println(answer);
        }
        else if(operator.equals("-")){
            Double secondNum = Console.getDoubleInput("Enter Second number");
            answer = simpleMath.subtract(firstNum,secondNum);
            System.out.println(answer);
        }
        else if(operator.equals("*")){
            Double secondNum = Console.getDoubleInput("Enter Second number");
            answer = simpleMath.multiply(firstNum,secondNum);
            System.out.println(answer);
        }
        else if(operator.equals("/")){
            Double secondNum = Console.getDoubleInput("Enter Second number");
            answer = simpleMath.divide(firstNum,secondNum);
            System.out.println(answer);
        }
        // this down is advancedMath
        else if(operator.equals("r")){
            answer= Math.sqrt(firstNum);
            System.out.println(answer);
        }
        else if(operator.equals("^")){
            Double secondNum = Console.getDoubleInput("Enter Second number");
            answer= Math.pow(firstNum,secondNum);
            System.out.println(answer);
        }
        else if(operator.equals("s")){
            answer= Math.sin(firstNum);
            System.out.println(answer);
        }
        else if(operator.equals("cs")){
            answer= Math.cos(firstNum);
            System.out.println(answer);
        }
        else if(operator.equals("t")){
            answer = Math.tan(firstNum);
            System.out.println(answer);
        }
        else if(operator.equals("is")){
            answer = Math.asin(firstNum);
            System.out.println(answer);
        }
        else if(operator.equals("ics")){
            answer = Math.acos(firstNum);
            System.out.println(answer);
        }
        else if(operator.equals("it")){
            answer = Math.atan(firstNum);
            System.out.println(answer);
        }
        else if(operator.equals("f")){
            for(int i=1;i <=firstNum;i++){
                answer+=firstNum*i;
                System.out.println(answer);
            }
        }
        else{
            System.out.println("Please enter a valid operator");
        }
       return answer;
    }




}
