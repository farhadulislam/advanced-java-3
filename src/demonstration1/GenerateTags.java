package demonstration1;

import java.util.ArrayList;
import java.util.List;

public class GenerateTags {

    public static void main(String [] args){

        String run_01 = generateNames();
    }

    public static String generateNames(){

        List<String> serverList = new ArrayList<>();
        String serverPrefix = "SN";
        String serverNumber = "00";

        List<Integer> serverList1 = new ArrayList<>();

        int startingNumber = 0;
        int iterationCount = 0;
        while (iterationCount < 8) {
            for (int i = startingNumber; i <= (startingNumber + 8); i++) {

          /*  //String serverPrefix = "RS";
            String temp = (String)i;
          String serverName = serverPrefix.concat(i);
          serverList.add(serverName);*/



                serverList1.add(startingNumber);
                //System.out.println(serverList1);

            }
            iterationCount ++ ;
            startingNumber = startingNumber + 3;
        }
        System.out.println(serverList1);
        return "Timestamp : " + System.currentTimeMillis();
    }
}
