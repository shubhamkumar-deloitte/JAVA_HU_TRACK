package FileHandlingAssignment;
import java.io.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) throws Exception {

        try{
            String filename="C:\\Users\\shubhamkumar32\\Desktop\\Studentdata.csv";
            FileOutputStream   fileout=new FileOutputStream(filename);
            fileout.close();
            System.out.println("excel file has been created");
        }catch(Exception e){
            e.printStackTrace();
        }


        //reading from excel sheets
        FileInputStream fis=null;
        try{
            fis= new FileInputStream("C:\\Users\\shubhamkumar32\\Desktop\\Students.csv");
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        //sorting



    }
}
