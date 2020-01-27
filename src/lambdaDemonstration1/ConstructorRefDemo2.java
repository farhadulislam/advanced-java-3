package lambdaDemonstration1;

interface MyFunc6<T>{
    MyClass6<T> func(T n);
}

class MyClass6<T>{
    private T val;
    MyClass6(T v){
        val= v;
    }

    MyClass6(){

        val = null;
    }

    T getVal(){

        return val;
    }


}


public class ConstructorRefDemo2 {

    public static void main (String [] args){

        MyFunc6<Integer> myClassCons6 = MyClass6:: new;
        MyClass6<Integer> mc6 = myClassCons6.func(100);

        System.out.println("The value in mc6 is "+ mc6.getVal());
    }
}
