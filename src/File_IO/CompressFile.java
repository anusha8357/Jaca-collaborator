package File_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressFile {

    private static void CompressFile(String filePath) throws IOException{
        try{
            File file = new File(filePath);
            String zipFileName = file.getName().concat(".zip");

            FileOutputStream fileOutputStream = new FileOutputStream((zipFileName));
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);

            zipOutputStream.putNextEntry(new ZipEntry(file.getName()));

            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            zipOutputStream.write(bytes, 0, bytes.length);
            zipOutputStream.closeEntry();
            zipOutputStream.close();
        } catch (FileNotFoundException e){
            System.out.format("the file %s not exist", filePath);
        } catch (IOException e){
            System.out.println("IO Error: " + e);
        }
    }

    public static void main(String[] args){
        try{
            CompressFile("TestFileThree.");
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
