import java.util.Scanner;

public class timeConverterconditional1
{ 

public static void main(String [] args)

   { 
      Scanner keyboardIn = new Scanner(System.in);
 
  
      System.out.println("Please enter the irish time.");
      System.out.println("Enter the hours of your irish time in 24h format: ");
      int hours = keyboardIn.nextInt(); 
      System.out.println("Enter the minutes of your irish time: ");
      int minutes = keyboardIn.nextInt(); 
  
   
      if(hours >=0 && hours <25 && minutes >= 0 && minutes < 61 )
    
      {
      System.out.println("Irish Time: " +(hours<10 ? "0":"") +hours + ":" + minutes);
      
   
      if(hours>4)
      {
      int Nyhours = hours -5;
      System.out.println("New York Time: "+ (Nyhours<10 ? "0":"") + Nyhours + ":" +minutes);
      }
      else
      {
      int Nyhours = 24 +( hours-5 );
      System.out.println("New York Time: "+ (Nyhours<10 ? "0":"") + Nyhours + ":" +minutes);
      }
      
      if(hours>7)
      {
      int Sfhours = hours -8;
      System.out.println("San Francisco:: "+ (Sfhours<10 ? "0":"") + Sfhours + ":" +minutes);
      }
      else
      {
      int Sfhours = 24 +( hours-8 );
      System.out.println("San Francisco:: "+ (Sfhours<10 ? "0":"") + Sfhours + ":" +minutes);
      }
      
      if(hours<12)
      {
      int Sihours = hours +10;
      System.out.println("Sidney: "+ (Sihours<10 ? "0":"") + Sihours + ":" +minutes);
      }
      else
      {
      int Sihours = 24- ( hours+10 );
      System.out.println("Sidney: "+ (Sihours<10 ? "0":"") + Sihours + ":" +minutes);
      }
      
      } 
     
     
    else
      System.out.println("Please enter a valid time");
     
   }
}