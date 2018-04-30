package genericDemonstration1;

import java.util.ArrayList;
import java.util.List;

public class NonRefiableExamples {

    public static void main(String... args){

        List<String> string = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        System.out.println(string.getClass());
        System.out.println(integers.getClass());

        List<? extends Number> numbers = new ArrayList<>();
        System.out.println(numbers.getClass()==integers.getClass());
    }
}
