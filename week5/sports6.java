import java.util.Scanner;
public class sports6
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String sport ;
      
      System.out.print("Enter a sport: ");
      sport = keyboardIn.nextLine();
      
      switch (sport)
      {
         case "Tennis" :
         case "Badminton" :
         System.out.print("1 person is required");
         break;
         case "Basketball" :
         System.out.print("5 players are required");
         break;
         case "Hurling":
         case "Football" :
         case "Rugby" :
         System.out.print("15 players are required");
         break;
         case "Soccer" :
         System.out.print("11 players are required");
         break;
         default : System.out.print("Invalid");
      }
      
   }
}
