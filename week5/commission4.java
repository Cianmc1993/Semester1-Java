import java.util.Scanner;

 public class commission4
{ 

public static void main(String [] args)

 { Scanner keyboardIn = new Scanner(System.in);
  
   System.out.print("Please enter your Code: ");
   char code = keyboardIn.next().charAt(0);
   
   System.out.print("Please the products value: ");
   double value = keyboardIn.nextDouble();  
   
  
      
   switch(code)
  { 
      case '1': 
      case '4':
      case '6': System.out.println("Commission: 5 %, Value:" + value);
                System.out.println("Commission earned: " + value*0.05);
                break; 
      case '2': System.out.println("Commission: 20 %, Value:" + value);
                System.out.println("Commission earned: " + value*0.2);
                break; 
      case '3': 
      case '5': System.out.println("Commission: 10 %, Value:" + value);
                System.out.println("Commission earned: " + value*0.1);
                break;
    
      default : System.out.println("Invalid Code");
     
      
   
     
  }
     
 }
}