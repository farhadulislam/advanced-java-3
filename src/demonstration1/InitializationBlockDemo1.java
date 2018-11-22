package demonstration1;

public class InitializationBlockDemo1 {
    static {
        int capacity = 20;
    }
    Integer number = 300;

    public static int capacity2 = initializeClassVariable();

    public static void main (String [] args){

        System.out.println("There is static block");
    }

    private static int initializeClassVariable(){

        return 25;
    }
}
