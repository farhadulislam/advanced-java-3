package genericDemonstration1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {


    public final static HashMap<Integer, String> map1 = new HashMap<Integer, String>(){


    };
    private static ArrayList<Integer> numbers;


    public static void main (String ... args) {

        numbers = new ArrayList<>();

        map1.put(23,"Three");
        map1.put(24,"Four");
        map1.put(25,"D");
        map1.put(26,"D");

    }
}
