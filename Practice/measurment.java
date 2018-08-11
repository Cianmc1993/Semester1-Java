import java.util.Scanner;
public class measurment
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double cent ;
      
      System.out.print("Enter a measurment in centimetres: ");
      cent = keyboardIn.nextDouble();
      
      //2.54 centimenres = 1 inch
      //12 inchs = 1 foot
      
      double inch = cent / 2.54;
      double foot = inch / 12;
      
      System.out.print(cent +"centimetres converted into foot and inches is "+foot+" foot and "+inch+" inches");
     
   }
}
