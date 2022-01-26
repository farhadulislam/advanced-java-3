package demonstration1;

public class StringDemo1 {

    public static void main(String[] args) {

      System.out.println(reverseStr("Farhad"));

      printNumber();

      stringInternDemo();

    }

    static String reverseStr(String str) {

        String result = "";
        int i;
        for (i = str.length()-1; i>=0; i--){
            result+= str.charAt(i);
        }
        return result;
    }

    static void printNumber(){

            int a, b, c;
            for (a = 1; a <= 3; a++) {
                for (b = 1; b <= 3 && b != a; b++) {
                    for (c = 1; c <= 3 && c != a && c != b; c++) {
                        //printf ("%d, %d, %d\n", a, b, c);

                        System.out.println(a + " " + b + " " + c);
                    }

                }

            }


    }

    static void stringInternDemo(){

        String s1 = "Patience is virtue";
        String s2 = "Patience is virtue";
        if(s1==s2)
            System.out.println("true");

        if(s1.equals(s2))
            System.out.println("true");

        String s3 = s1.intern();
        String s4 = s2.intern();

        if(s3==s4)
            System.out.println("true");


    }

}
