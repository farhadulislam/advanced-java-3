package demonstration2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CommandLineArgsDemo {

    public static void main (String [] args){


    }

    private static void showFileLines(String filename){

        System.out.println(" ");

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(filename))){

            String line = null;

            while((line = reader.readLine()) != null)
                System.out.println(line);

            


        }catch(Exception ex){
            System.out.println(ex.getClass().getSimpleName() + "-"+ ex.getMessage());
        }
    }
}
