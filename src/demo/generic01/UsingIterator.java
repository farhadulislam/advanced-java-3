package demo.generic01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UsingIterator {

    public static void main (String... args){


        String [] fruits = {"Apple", "Banana", "Papaya", "Kiwi"};
        //List<String> strings = new ArrayList<>();
       // List<String> strings = Arrays.asList(fruits);

        List<String> strings = new ArrayList<>();

        strings.addAll(Arrays.asList(fruits));

        for(Iterator i = strings.iterator(); i.hasNext(); ){

            System.out.println(i.toString());

        }


    }
}
