import java.util.Scanner;
public class dayofweek7
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int day;
      
      System.out.print("Enter a day of the week as a number: ");
      day = keyboardIn.nextInt();
      
      switch (day)
      {
         case 1 : System.out.print("The day is Monday");
            break;
         case 2 : System.out.print("The day is Tuesday");
            break;
         case 3 : System.out.print("The day is Wednesday");
            break;
         case 4 : System.out.print("The day is Thursday");
            break;
            case 5 :
            case 6 :
            case 7 : System.out.print("The weekend is here");
            break;
            default : System.out.print("Invalid entry/Please enter a number between 1-7");
      }
      
   }
}