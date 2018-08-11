import java.util.Scanner ;
public class weightConverter 
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      
      int input , stone , pounds , returnPounds , ounces ;
      
      System.out.print("Enter weight in onces: ");
      input = keyboardIn.nextInt();
      
      pounds = input/16 ;
      ounces = input%16 ;
      stone = pounds/14 ;
      returnPounds = pounds%14 ;
      
      System.out.print("Your weight converted is " + stone + " Stone "+ returnPounds + " pounds  and "+ounces + " Ounces");
      
   }
}