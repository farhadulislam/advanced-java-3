package lambdaDemonstration1;

public class LambdaDemo1 {

    public static void main (String [] args ){

        MyNumber myNum;

        myNum = ()-> 3;

        System.out.println(myNum.getValue());

        NumericTest isEven;

        isEven = (n)-> n%2==0;
        if(isEven.isEvenTest(23)) System.out.println("The number is even");
    }
}
