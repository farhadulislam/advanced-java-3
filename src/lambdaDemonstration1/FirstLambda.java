package lambdaDemonstration1;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FirstLambda{

    public static void main (String... args){

    FileFilter fileFilter = new FileFilter(){

            public boolean accept(File file){

                return file.getName().endsWith(".java");
            }

            @Override
            public String getDescription() {
                return null;
            }
        };


       //FileFilter fileFilter = (File file)-> file.getName().endsWith(".java");

       // File dir = new File("C:/copyOfFIshFish/Learning/practiceLab/codeBase/advanced-java-3/src");

        //File [] files = dir.listFiles(fileFilter);


       // for (File f: files ){

            //System.out.println(f);
        //}

    }
}
