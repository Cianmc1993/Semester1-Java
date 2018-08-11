import java.util.Scanner;
public class wireColor5
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      char wire ;
      
      System.out.print("Choose your character: ");
      wire = keyboardIn.next().charAt(0);
      wire = Character.toLowerCase(wire);
      
      switch (wire)
      {
         case 'l' : case 'L' :
         System.out.print("Live - Brown");
         break;
         case 'e' : case 'E' :
         System.out.print("Earth - Green");
         break;
         case 'n' : case 'N' :
         System.out.print("Neutral - Blue");
         break;
         default : System.out.print("Invalid input");
      }
      
   }
}