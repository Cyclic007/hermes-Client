import hashing.HashUtils;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        File log = new File("log_"+timestamp.toString().replaceAll(" ","_").replaceAll("\\.",",").replaceAll("\\.",",")+".txt");
        System.out.println(log.getAbsolutePath());
        log.createNewFile();




    }
//    public static void main(String[] args)
//    {
//
//        try {
//            File Obj = new File("myfile.txt");
//            if (Obj.createNewFile()) {
//                System.out.println("File created: "
//                        + Obj.getName());
//            }
//            else {
//                System.out.println("File already exists.");
//            }
//        }
//        catch (IOException e) {
//            System.out.println("An error has occurred.");
//            e.printStackTrace();
//        }
//    }
}