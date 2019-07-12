package File_IO;

import java.io.File;
import java.io.IOException;

public class DeleteTheFile {
    public static void main(String[] args) throws IOException, InterruptedException{

        File file = new File("anusha");

        if(file.createNewFile()){
            System.out.println("file is created");
        }

      Thread.sleep(15000);

         if(file.delete()){
            System.out.println("File has been deleted");

        } else {
            System.out.println("file cannot be deleted");
        }


    }
}
