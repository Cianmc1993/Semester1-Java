//declaring use of scanner class
import java.util.Scanner ;
//declaring the class name
public class leapYear
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //declaring variable
      int year ;
      
      System.out.print("Enter any given year: ");
      year = keyboardIn.nextInt();
      
      if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
      {
         System.out.print("Year " +year + "is a leap year");
      }
      else
      {
        System.out.print("Year " +year + "is not a leap year");
      }
   }
}
 