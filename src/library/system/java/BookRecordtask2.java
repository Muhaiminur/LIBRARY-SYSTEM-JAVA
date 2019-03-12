public class BookRecordtask2{
  Book[]BookArray=new Book[100];
  static int count=0;
  public void AddRecord(String i1,String i2,String i3,String i4){
    BookArray[count]=new Book();
    BookArray[count].name=i1;
    BookArray[count].id=i2;
    BookArray[count].author=i3;
    BookArray[count].publisher=i4;
    System.out.println("Successssssfuullyy   Data Entered!!");
    count++;
  }
  public void PrintRecord(){
    int d=0;
    while(d<count){
      System.out.print(BookArray[d].name+" ");
      System.out.print(BookArray[d].id+" ");
      System.out.print(BookArray[d].author+" ");
      System.out.print(BookArray[d].publisher+" ");
      System.out.println();
      d++;
    }
  }
}