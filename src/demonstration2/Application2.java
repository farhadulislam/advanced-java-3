package demonstration2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {

    public static final int IDENTIFIER = 200;
    public static void main (String ... args){

        System.out.println("Application 2");

        printSomeNumbers();
    }

    public static void printSomeNumbers(){

        Set<Integer> setOfIntegers = new LinkedHashSet<>();

        for( Integer i = 0; i < 20; i++){

            setOfIntegers.add(i);
        }
        System.out.println(setOfIntegers);
    }
}