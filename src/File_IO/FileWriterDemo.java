package File_IO;

import java.io.*;

public class FileWriterDemo {

    static String fileContent = "Using PrintWriter Class";

    public static void main(String[] args) throws IOException {
        usingPrintWriter();
        usingDataOutput();

    }

    public static void usingPrintWriter() throws IOException{



        FileWriter fileWriter = new FileWriter("TestFileOne.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.append(fileContent);
        printWriter.printf("Java class %s", "Java - Topic");
        printWriter.close();
    }

    public static void usingDataOutput() throws IOException{

        FileOutputStream outputStream = new FileOutputStream("src/File_IO/TestFileOne.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(outputStream));
    }
}
