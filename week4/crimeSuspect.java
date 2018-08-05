import java.util.Scanner;
   public class crimeSuspect
{
      public static void main(String [] args)
   {
      Scanner keyboardIn=new Scanner(System.in);
      
      String name;
      int age;
      double height;
      
      System.out.print("Enter name: ");
      name=keyboardIn.nextLine();
      
      System.out.print("Enter age: ");
      age=keyboardIn.nextInt();
      
      System.out.print("Enter height: ");
      height=keyboardIn.nextDouble();
      
      if(age>19 && age<31 && height>=160 && height<=175)
      {
         System.out.print(name+" is a suspect and should be interrogated");
      }
      
      else
      {
         System.out.print(name+" is not a suspect and should be released");
      }
     
   }
}
      