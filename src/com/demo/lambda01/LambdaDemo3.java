package com.demo.lambda01;

public class LambdaDemo3 {
    public static void main (String... args){

        FactorialExample fact1 = (n) ->{
            int result = 1;
            for (int i = 1; i<=n; i++){
                result = result * i;
            }
            return result;
        };

        NumberExample ne  = (n)-> n/2;

        System.out.println("The factorial of 3 is " + fact1.func(3));

    }
}
