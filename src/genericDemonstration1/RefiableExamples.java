package genericDemonstration1;

import java.util.ArrayList;
import java.util.List;

public class RefiableExamples {

    public static void main (String... args){

        System.out.println(int.class);
        System.out.println(String.class);
        List<?> wildCards = new ArrayList<>();
        System.out.println(wildCards);
        List raw = new ArrayList();
        System.out.println(raw);
        System.out.println(wildCards.getClass()==raw.getClass());
    }
}
