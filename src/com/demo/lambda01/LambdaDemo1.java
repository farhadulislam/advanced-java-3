package com.demo.lambda01;

public class LambdaDemo1 {

    public static void main (String [] args ){

        MyNumber myNum;

        myNum = ()-> 3;

        System.out.println(myNum.getValue());

        NumericTest isEven;
        NumericTest isEven2;

        isEven = (n)-> n%2==0;
        isEven2 = n-> n%2==0; // for single param, it is fine to take parenthesis off.
        if(isEven.isEvenTest(22)) System.out.println("The number is even");
        if(isEven2.isEvenTest(50)) System.out.println("The number is even");
    }
}
