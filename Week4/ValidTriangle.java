import java.util.Scanner;
public class ValidTriangle
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double a , b , c ;
      
      System.out.print("Enter length of side a: ");
      a = keyboardIn.nextInt();
      
      System.out.print("Enter length of side b: ");
      b = keyboardIn.nextInt();
      
      System.out.print("Enter length of side c: ");
      c = keyboardIn.nextInt();
      
      if((a+b)>c && (a+c)>b && (b+c)>a)
      {
         System.out.print("Forms a triangle");
      }
      else
      {
         System.out.print("Not a triangle");
      }
   }
}
