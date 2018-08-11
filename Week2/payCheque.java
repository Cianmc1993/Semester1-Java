import java.util.Scanner ;
public class payCheque
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String name ;
      int hours ;
      double rate ;
      final double TAXRATE = 0.4 ;
      final double PRSI = 0.05 ;
      
      System.out.print("Enter name: ");
      name = keyboardIn.nextLine();
      
      System.out.print("Enter hours worked: ");
      hours = keyboardIn.nextInt();
      
      System.out.print("Enter rate: ");
      rate = keyboardIn.nextDouble();
      
      double grossPay = hours * rate ;
      double tax = grossPay * TAXRATE ;
      double prsi = grossPay * PRSI ;
      double totalDeductions = tax + prsi ;
      double netPay = grossPay - totalDeductions ;
      
      System.out.println("***************************************************************************");
      System.out.println("                             " + name + "                                  ");
      System.out.println("***************************************************************************");
      System.out.println(" Hours: " + hours +  "     Rate: " + rate  + "      Gross Pay: "         + grossPay);
      System.out.println("");
      System.out.println("Less deductions:");
      System.out.println(" Tax: "   + tax   +  "     PRSI: " + prsi  + "       Total Deductions: "   + totalDeductions);
      System.out.println("");
      System.out.println("                                                         Net Pay: " + netPay);
      System.out.println("****************************************************************************");
      
   }
}
      
      
      
      
      