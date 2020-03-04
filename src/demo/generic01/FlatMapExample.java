package demo.generic01;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

    public static void main (String... args){

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,9,0);
        List<Integer> list2 = Arrays.asList(33,51,21);
        List<Integer> list3 = Arrays.asList(457,575,57565,23);

        List<List<Integer>> list = Arrays.asList(list1,list2,list3 );

        System.out.println(list);



    }
}
