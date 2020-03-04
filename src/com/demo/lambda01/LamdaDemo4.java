package com.demo.lambda01;

public class LamdaDemo4 {


    public static void main (String [] args){

        NumericTest2 isEven = (n) -> (n%2)==0;

        System.out.println(isEven.test(23));
    }
}


