package lambdaDemonstration1;

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


}
