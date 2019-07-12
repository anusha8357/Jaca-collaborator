//package File_IO;
//
//import java.io.File;
//import java.io.IOException;
//
//public class HIdeFile {
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//
//        String strFilePath = "";
//        File file = new File(strFilePath);
//
//        /*use exec method
//
//        Process p =Runtime.getRuntime().exec("attrib + H" + strFilePath); //try to find the path in our laptop
//
//        p.waitFor();
//
//        if(file.isHidden()) {
//            System.out.println("File is Hidden");
//        }else {
//            System.out.println("File is visible");
//        }
////
////        File file = new File("TestFileOne.txt");
////
////        if(file.createNewFile()){
////            System.out.println("File has been created");
////        } else{
////            System.out.println("File already exists");
////        }
////
////        boolean ishidden = file.isHidden();
////        System.out.println(ishidden);
////
//
//    }
//
//}
