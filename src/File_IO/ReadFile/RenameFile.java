package File_IO.ReadFile;

import java.io.File;
import java.io.IOException;

public class RenameFile {

    public static void main(String[] args) throws InterruptedException{

        File file = new File("FileOne");
        File file1 = new File("anusha");

        try {
            boolean newFile = file.createNewFile();
            System.out.println("file is created");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(file.renameTo(file1)) {
            System.out.println("File is renamed");

            Thread.sleep(1000);

        }else{
            System.out.println("File cannot be renamed.");
        }

    }


}
