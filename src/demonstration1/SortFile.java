package demonstration1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortFile {

    public static void main (String [] args){

        String fileLocation = "C:\\folder\\folder\\fileName.txt" ;


        doReading(fileLocation);

    }

    public static void doReading(String fileLocation){

        try(BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }


            String everything = sb.toString();

            System.out.println(everything);


           if (everything.startsWith("Name")){

               System.out.println(everything);
           }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    public static void readFileAndMatch(String str){


        Matcher m = Pattern.compile(
                Pattern.quote("Pattern")
                        + "(.*?)"
                        + Pattern.quote(" Quote")
        ).matcher(str);
        while(m.find()){
            String match = m.group(1);
            System.out.println(">"+match+"<");
            //here you insert 'match' into the list
        }
    }
}

