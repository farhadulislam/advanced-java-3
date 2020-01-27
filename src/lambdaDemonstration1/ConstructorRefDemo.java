package lambdaDemonstration1;
interface MyFunc5{

    MyClass5 myFunc(int v);

}

class MyClass5{

    private int val;

    MyClass5(int v){ val = v;}

    MyClass5(){val=0;}



    int getVal(){return val;}


}
public class ConstructorRefDemo {

    public static void main (String [] args){

        MyFunc5 myClassCons = MyClass5::new;

        MyClass5 mc = myClassCons.myFunc(100);

        System.out.println(mc.getVal());

    }
}
