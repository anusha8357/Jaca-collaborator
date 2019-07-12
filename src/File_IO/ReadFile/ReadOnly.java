package File_IO.ReadFile;

import java.io.BufferedReader;  //Scanner like
import java.io.FileReader;

public class ReadOnly{

    public static void main(String[] args) throws Exception{


        FileReader file = new FileReader("TestFileThree.");
        BufferedReader bufferedReader = new BufferedReader(file);

        String ch = "";
        String line = bufferedReader.readLine();
        while (line != null) {
            ch += line;
            line = bufferedReader.readLine();
        }
        System.out.println(ch);
    }


}
