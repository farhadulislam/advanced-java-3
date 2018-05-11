package lambdaDemonstration1;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {
    public static void main (String ... args){

        Stream<String> stream = Stream.of("one", "two", "three", "four", "five", "six");
        Predicate<String> p1 = s -> s.length()> 3;
        Predicate<String> p2 = s -> s.contains("o") || s.contains("t");
        Predicate<String> p3 =  s -> s.startsWith("f");


        stream
                .filter(p1)
                .filter(p2)
                .forEach(s -> System.out.println(s));

    }
}
