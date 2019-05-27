package com.zipcodewilmington.scientificcalculator;

public class Operator {
    numGetter numClass = new numGetter();


    public  Double getOperator(String operator,Double firstNum)

    {Double answer = 0.0;


        if(operator.equals("+")){
            Double secondNum = Console.getDoubleInput("Enter Second number");
            answer = simpleMath.add(firstNum,secondNum);



        }
        else if(operator.equals("-")){
            Double secondNum = Console.getDoubleInput("Enter Second number");
            answer = simpleMath.subtract(firstNum,secondNum);

        }
        else if(operator.equals("*")){
            Double secondNum = Console.getDoubleInput("Enter Second number");
            answer = simpleMath.multiply(firstNum,secondNum);

        }
        else if(operator.equals("/")){
            Double secondNum = Console.getDoubleInput("Enter Second number");
            answer = simpleMath.divide(firstNum,secondNum);

        }
        // this down is advancedMath
        else if(operator.equals("r")){
            answer= advancedMath.sqrt(firstNum);

        }
        else if(operator.equals("^")){
            Double secondNum = Console.getDoubleInput("Enter Second number");
            answer= advancedMath.pow(firstNum,secondNum);

        }
        else if(operator.equals("s")){
            answer= advancedMath.sin(firstNum);

        }
        else if(operator.equals("cs")){
            answer= advancedMath.cos(firstNum);

        }
        else if(operator.equals("t")){
            answer = advancedMath.tan(firstNum);

        }
        else if(operator.equals("is")){
            answer = advancedMath.asin(firstNum);

        }
        else if(operator.equals("ics")){
            answer = advancedMath.acos(firstNum);

        }
        else if(operator.equals("it")){
            answer = advancedMath.atan(firstNum);
            
        }
        else if(operator.equals("!")){
            answer = 1.0;
            for(int i=2;i <=firstNum;i++){
                answer *= i;

            }
        }
        else{
            System.out.println("Please enter a valid operator");
        }


        int dispMode = app.getDispMode();
        System.out.println(displayMode.display(answer, dispMode));
        return answer;
    }




}
