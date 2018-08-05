import java.util.Scanner;
public class totalPay
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
     int hours;
     double rate;
     
     System.out.print("Enter number of hours worked: ");
     hours = keyboardIn.nextInt();
     
     System.out.print("Enter rate per hour: ");
     rate = keyboardIn.nextDouble();
     
     double wage = hours * rate ;
     
     
     if(hours <= 37)
     {
     System.out.print("Your total pay is " + wage + "euro"); 
     }
     
     else if (hours <= 40)
     {
      wage = wage * 1.10;
      System.out.print("Your total pay is " + wage + "euro");
     }
     
     else if (hours <= 45)
     {
      wage = wage * 1.15;
      System.out.print("Your total pay is " + wage + "euro");
     }
     
     else
     {
      wage = wage * 1.20;
      System.out.print("Your total pay is " + wage + "euro");
     }   
   }
}
     