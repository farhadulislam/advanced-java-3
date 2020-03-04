package demo.lambda01;


interface StringFunc2{

    String func(String n);
}
class MyStringOps2{

    String strReverse(String str){
        String result = "";
        int i;

        for (i = str.length()-1; i>=0; i--){

            result+=str.charAt(i);
        }

        return result;

    }
}


public class MethodRefDemo2 {

    static String stringOp2(StringFunc2 sf, String s){

        return sf.func(s);

    }

    public static void main (String [] args){

        String inStr = "Lamdas are cool";

        String outStr;
        MyStringOps2 strOps = new MyStringOps2();

        outStr = stringOp2(strOps::strReverse, inStr);



        System.out.println("Original string: "+ inStr);
        System.out.println("String reversed: "+ outStr);




    }
}
