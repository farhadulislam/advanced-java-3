package com.demo.lambda01;

interface MyFunc7<R,T>{
   R func(T n);
}

class MyClass7<T>{
    private T val;
    MyClass7(T v){
        val= v;
    }

    MyClass7(){

        val = null;
    }

    T getVal(){

        return val;
    }


}
class MyClass7a{
    String str;
    MyClass7a(String s){
        str = s;
    }

    MyClass7a(){

        str = " ";
    }

    String getVal(){

        return str;
    }


}

public class ConstructorRefDemo3 {


    static <R, T> R myClassFactory(MyFunc7<R,T> cons, T v){

        return cons.func(v);
    }

    public static void main (String [] args){

        MyFunc7<MyClass7<Double>, Double> myClassCons = MyClass7<Double>:: new;

        MyClass7<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println("Val is mc is " + mc.getVal());

        MyFunc7<MyClass7a, String> myClassCons2 = MyClass7a::new;

        MyClass7a mc2 = myClassFactory(myClassCons2, "Lambda");

        System.out.println("Value is mc2 is :" + mc2.getVal());




    }


}
