package demonstration2;

import java.util.Scanner;

public class IntegerStringConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int intVar;

        String strVar;

        // read it as string

        System.out.print("Enter an integer: ");

        strVar = in.nextLine();

        // convert to integer

        try {

            intVar = Integer.parseInt(strVar);

            System.out.println("strVar = \"" + strVar + "\"");

            System.out.println("intVar = " + intVar);

        } catch (NumberFormatException e) {

            System.out.println("Can't convert \"" + strVar + "\" to integer.");

        }

        System.out.println();

        // read it as integer

        System.out.print("Enter an integer: ");

        intVar = in.nextInt();

        strVar = Integer.toString(intVar);

        System.out.println("intVar = " + intVar);

        System.out.println("strVar = \"" + strVar + "\"");

    }

}
