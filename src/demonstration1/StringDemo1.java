package demonstration1;

public class StringDemo1 {

    public static void main(String[] args) {

      System.out.println(reverseStr("Farhad"));
    }

    static String reverseStr(String str) {

        String result = "";
        int i;
        for (i = str.length()-1; i>=0; i--){
            result+= str.charAt(i);
        }
        return result;
    }

}
