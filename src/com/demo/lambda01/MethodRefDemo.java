package com.demo.lambda01;

interface StringFunction{

    String func(String n);

        }

        class MyStringOps {
    // A static method that reverses a String
    static String strReverse(String str){

        String result = " ";

        int i;

        for (i = str.length()-1; i>=0; i--){

            result+=str.charAt(i);
        }
        return  result;

    }
        }

public class MethodRefDemo {

    static String stringOp(StringFunction sf, String s){

        return sf.func(s);
    }
    public static void main (String [] args){

        String inStr = "Lamdas are nice";

        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);



        System.out.println("Original string: "+ inStr);
        System.out.println("String reversed: "+ outStr);


    }
}
