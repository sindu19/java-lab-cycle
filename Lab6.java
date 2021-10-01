import java.util.Scanner;
class Lab6
 {
   int sno;
   String sname;
   student()
    {
      sno=1;
      sname="rama";
    }
   student(int sno1,String sname1)
    {
      this.sno=sno1;
      this.sname=sname;
    }
   void display()
    {
      System.out.println(sno + sname);
    }
   public static void main(String args[])
    {
      Student s=new Student();
      S.display();
      Student S1=new Student(3,"sita");
      S1.display();
      Scanner ob=new Scanner(System.in);
      int Sno2=ob.nextInt();
      String sname2=ob.next();
      Student S3=new Student(sno2,sname2);
      S3.display();
     }
}