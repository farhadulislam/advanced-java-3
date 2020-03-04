package com.demo.lambda01;
interface MyFunc {
    int fucn(int n);
}
public class VarCapture {

    public static void main (String [] args){
        int num =10;

        MyFunc myLambda = (n)-> {
            int v = num + n;

            return v;
        };


    }
}
