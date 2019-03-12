/*Book Records Class

You need to write a BookRecord class. In the BookRecord class, you have to declare an array BookArray
of the instance of the Book class. The BookRecord class contains the following methods that can manipulate the �BookArray�
with the instances of the Book class:

AddRecord: The AddRecord method adds a new Book record to the BookArray at the next available empty index of the array. 
If the array is full, then you should resize the array and add the new record.

PrintRecord: The PrintRecord method sorts the BookArray in alphabetical order according to their names. 
If there is a tie (i.e., if multiple Books have the same name), then sort them according to their ids. After sorting,
this method prints the contents (Name,Id, Author, Publisher) of the BookArray, each record in a line.

DeleteRecord: The DeleteRecord method asks the users to enter the Id number of a Book to be deleted. 
Then, delete that record and reports (by printing a message) the success and failure of the deletion.
After completion of a deletion, your program will show a message ID #### is deleted. If the given Id does not exist, 
your program will show a message ID #### does not exist. Once, a record is deleted, 
the DeleteRecord method also shift left all records that are to the right of the deleted record.

Edit Record: The EditRecord method asks the user to enter a Book Id and edits its corresponding information (name, publisher).
If the given Id does not exist, your program will show a message ID #### does not exist.
EditRecord method should be able to edit one or more information of that Book.*/
import java.util.Scanner;
public class BookRecord{
  Scanner abir=new Scanner(System.in);
  int c=500;
  Book[]BookArray=new Book[c];
  int count=0;
  public void AddRecord(String o1,String o2,String o3,String o4){
    if(count==BookArray.length){
      System.out.println("plese wait memory is full!!");
      System.out.println("memory resize done");
      c=c*c;
      Book[]temp=new Book[BookArray.length];
      for(int d=0;d<BookArray.length;d++){
        temp[d]=BookArray[d];
      }
      Book[]BookArray=new Book[c];
      for(int e=0;e<temp.length;e++){
        BookArray[e]=temp[e];
      }
    }
    BookArray[count]=new Book();
    BookArray[count].name=o1;
    BookArray[count].id=o2;
    BookArray[count].author=o3;
    BookArray[count].publisher=o4;
    System.out.println("Data enterd successfully");
    count++;
  }
  public void PrintRecord(){
    if(count==0){
      System.out.println("First add the book Data");
    }
    if(count!=0){
      System.out.println("Printing the Database");
      try{
        Object temp;
        for(int f=0;f<count;f++){
          for(int g=f+1;g<count;g++){
            if(BookArray[f].name.compareToIgnoreCase(BookArray[g].name)> 0){
              if(BookArray[f].name==BookArray[g].name){
                if(BookArray[f].id.compareToIgnoreCase(BookArray[g].id)>0){
                  temp=BookArray[f];
                  BookArray[f]=BookArray[g];
                  BookArray[g]=(Book)temp;
                }
              }
              temp=BookArray[f];
              BookArray[f]=BookArray[g];
              BookArray[g]=(Book)temp;
            }
          }
        }
      }catch(Exception e){
      }
      for(int h=0;h<=count;h++){
        if(BookArray[h]==null){
          break;
        }
        System.out.print(BookArray[h].name+" ");
        System.out.print(BookArray[h].id+" ");
        System.out.print(BookArray[h].author+" ");
        System.out.print(BookArray[h].publisher+" ");
        System.out.println("=======DONE============");
      }
    }
  }
  public void DeleteRecord(String o5){
    if(count==0){
      System.out.println("Please enter the First dat");
    }
    boolean b=true;
    for(int i=0;i<count;i++){
      if(BookArray[i].id.equals(o5)){
        System.out.println("id found");
        for(int m=i;m<count;m++){
          BookArray[m]=BookArray[m+1];
          BookArray[BookArray.length-1]=null;
        }
        b=true;
        break;
      }else{
        b=false;
      }
    }
    if(b==true){
      System.out.println("ID "+o5+" is deleted");
      count--;
    }else{
      System.out.println("ID "+o5+"  does not exist");
    }
    
  }
  public void EditRecord(String o6){
    if(count==0){
      System.out.println("Please enter the First dat");
    }
    boolean b2=true;
    int box=0;
    for(int j=0;j<count;j++){
      if(BookArray[j]==null){
        break;
      }
      if(BookArray[j].id.equals(o6)){
        box=j;
        b2=true;
        break;
      }else{
        b2=false;
      }
    }
    System.out.println("press 1 to edit book name");
    System.out.println("press 2 to edit book id");
    System.out.println("press 3 to edit book author name");
    System.out.println("press 4 to edit book publisher name");
    int x=abir.nextInt();
    if(x==1){
      System.out.println(" book new name please");
      BookArray[box].name=abir.next();
      System.out.println("Do you still want to edit?... press 'y' to continue edit or press any to exit edit");
      String s=abir.next();
      
      if(s.equalsIgnoreCase("y")){
        EditRecord(o6);
      }
    }
    if(x==2){
      System.out.println(" book new ID please");
      BookArray[box].id=abir.next();
      System.out.println("Do you still want to edit?... press 'y' to continue edit or press any to exit edit");
      String s=abir.next();
      
      if(s.equalsIgnoreCase("y")){
        
        EditRecord(o6);
      }
    }
    if(x==3){
      System.out.println(" book new author please");
      BookArray[box].author=abir.next();
      System.out.println("Do you still want to edit?... press 'y' to continue edit or press any to exit edit");
      String s=abir.next();
      
      if(s.equalsIgnoreCase("y")){
        EditRecord(o6);
      }
    }
    if(x==4){
      System.out.println(" book new publisher please");
      BookArray[box].publisher=abir.next();
      System.out.println("Do you still want to edit?... press 'y' to continue edit or press any to exit edit");
      String s=abir.next();
      
      if(s.equalsIgnoreCase("y")){
        
        EditRecord(o6);
      }
    }
    if(b2==true){
      System.out.println("id "+o6+" edited!!!");
    }else{
      System.out.println("ID "+o6+" does not exist");
    }
  }
}