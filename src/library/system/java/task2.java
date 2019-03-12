/*Task 2

Write a java program that reads a text file Book.txt containing Books information with name, id ,author and publisher 
(one line contains information of one Book). Then, your program reads these data and save them in an array of Book Class. 
The Book Class contains name, id and author and publisher as its fields. Finally,
your program reads each entry from the array and the write the data in the new file Object.txt.*/
import java.util.Scanner;
import java.io.*;
public class task2{
  public static void main(String[]args){
    File f=new File("G:\\JAVA PROGAMMING\\CODING\\DATA STRUCTURES\\LIBRARY SYSTEM JAVA\\LIBRARY SYSTEM JAVA\\src\\library\\system\\java\\abirmy.txt");
    try{
      FileInputStream abirf=new FileInputStream(f);
      int c=0;
      while((c=abirf.read())!=-1){
        System.out.print((char)c);
      }
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}