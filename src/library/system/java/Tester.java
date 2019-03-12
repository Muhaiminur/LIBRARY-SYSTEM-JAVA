/*Tester Class

Your program should have a TesterClass containing the main method. In the main method, your program should print the following message:

Enter 1 to Add a Record

Enter 2 to Print the Records

Enter 3 to Delete a Record

Enter 4 to Edit a Record

If the user chooses 1, then the program will add a new Book record to the BookArray. If the user chooses 2, 
then the program will print the Book list in alphabetical order. If the user chooses 3, then the program will delete the records of the given Id.
If the user chooses 4, then the program will edit the records of the given Id.

Upon the completion of one operation (choosing one option among 1  4), 
your command line menu will ask the user whether s/he wants to continue the program. If the user press Y/y, 
then the user will be given menu 1  4 again. Otherwise the user will quit the program.*/
import java.util.Scanner;
public class Tester{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    BookRecord bo=new BookRecord();
    System.out.println("Enter 1 to Add a Record");
    System.out.println("Enter 2 to Print the Records");
    System.out.println("Enter 3 to Delete a Record");
    System.out.println("Enter 4 to Edit a Record");
    int x=abir.nextInt();
    switch(x){
      case 1:
        System.out.println("Enter Book Name");
        String x1=abir.nextLine();
        x1=abir.nextLine();
        System.out.println("Enter Book Id");
        String x2=abir.nextLine();
        System.out.println("Enter Book author name");
        String x3=abir.nextLine();
        System.out.println("Enter Book publisher name");
        String x4=abir.nextLine();
        bo.AddRecord(x1,x2,x3,x4);
        break;
      case 2:
        bo.PrintRecord();
        break;
      case 3:
        System.out.println("enter your desire deleting id");
        String x5=abir.next();
        bo.DeleteRecord(x5);
        break;
      case 4:
        System.out.println("enter your desire Edited id");
        String x6=abir.next();
        bo.EditRecord(x6);
        break;
      default:
        System.out.println("Wrong Entry.. Follow the Instructions");
        System.out.println();
    }
    System.out.println("if you wants to continue the program then press Y/y");
    String x7=abir.next();
    if(x7.equalsIgnoreCase("y")){
      while(true){
        try{
        System.out.println("Enter 1 to Add a Record");
        System.out.println("Enter 2 to Print the Records");
        System.out.println("Enter 3 to Delete a Record");
        System.out.println("Enter 4 to Edit a Record");
        System.out.println("pres 0 for quite");
        
          int y=abir.nextInt();
          switch(y){
            case 0:
              System.exit(y);
            case 1:
              System.out.println("Enter Book Name");
              String y1=abir.nextLine();
              y1=abir.nextLine();
              System.out.println("Enter Book Id");
              String y2=abir.nextLine();
              System.out.println("Enter Book author name");
              String y3=abir.nextLine();
              System.out.println("Enter Book publisher name");
              String y4=abir.nextLine();
              bo.AddRecord(y1,y2,y3,y4);
              break;
            case 2:
              bo.PrintRecord();
              break;
            case 3:
              System.out.println("enter your desire deleting id");
              String y5=abir.next();
              bo.DeleteRecord(y5);
              break;
            case 4:
              System.out.println("enter your desire Edited id");
              String y6=abir.next();
              bo.EditRecord(y6);
              break;
            default:
              System.out.println("Wrong Entry.. Follow the Instructions");
              System.out.println();
          }
        }catch(Exception e){
          System.out.println("Please follow the instructions");
        }
      }
    }else{
      System.exit(0);
    }
  }
}