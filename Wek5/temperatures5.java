import java.util.Scanner;

public class temperatures5
{ 

   public static void main(String [] args)
   { 
      Scanner keyboardIn = new Scanner(System.in);
  
      System.out.print("Please enter your Temperatur 1: ");
      double temp1 = keyboardIn.nextDouble();
   
      System.out.print("Please enter your Temperatur 2: ");
      double temp2 = keyboardIn.nextDouble();
   
      System.out.print("Please enter your Temperatur 3: ");
      double temp3 = keyboardIn.nextDouble();
   
  
      double tempAvg = (temp1+temp2+temp3) / 3;
   
      if(tempAvg < 0)
      {
      System.out.println("Freezing");
      }
      else if(tempAvg > 0 && tempAvg <= 9)
      {
      System.out.println("Cold");
      }
      else if(tempAvg > 9 && tempAvg <= 16)
      {
      System.out.println("Moderate");
      }
       else
      {
      System.out.println("Warm");
      }
      
   }
}