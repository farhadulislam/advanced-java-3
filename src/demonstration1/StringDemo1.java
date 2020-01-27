package demonstration1;

public class StringDemo1 {

    public static void main(String[] args) {

      System.out.println(reverseStr("Farhad"));

      printNumber();

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

}
