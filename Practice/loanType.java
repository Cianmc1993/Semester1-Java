import java.util.Scanner;
public class loanType
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      System.out.print("Please enter your loan amount: ");
      double loan = keyboardIn.nextDouble();
      
      System.out.print("Please enter loan type: ");
      char type = keyboardIn.next().charAt(0);
      type = Character.toLowerCase(type);
      
      switch(type)
      {
         case 'A' : case 'a' : case 'Z' : case 'z' :
         System.out.println("Interest due is 10%");
         System.out.print("Total repayment is "+((loan * .10) + loan )+" euro");
         break;
         case 'K' : case 'k' : case 'P' : case'p' :
         System.out.println("Interest due is 5%");
         System.out.print("Total repayment is "+((loan * .05) + loan )+" euro");
         break;
         case 'M' : case 'm' :
         System.out.println("Interest due is 4%");
         System.out.print("Total repayment is "+((loan * .04) + loan) +" euro");
         break;
         default : System.out.print("Invalid input");
      }
   }
}

