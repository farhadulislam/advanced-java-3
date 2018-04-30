package lambdaDemonstration1;

import genericDemonstration1.Person;

import java.util.function.Predicate;

public class LambdaDemo2 {


    public static void main (String... args){

        final Person tom = new Person("Tom", 69);
        final Person jerry = new Person("Jerry", 34);
        final Person woodpecker = new Person("Wood Pecker", 100);
        Predicate<Person> isOld = person -> person.getAge() > 80 ;

        System.out.println(isOld.test(woodpecker));


    }

}