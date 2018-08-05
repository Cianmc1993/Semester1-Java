import java.util.Scanner;

public class sales1
{ 

   public static void main(String [] args)

   { 
      Scanner keyboardIn = new Scanner(System.in);
      double bonusEarned;
      double bonusPerc = 0.04;
      int additionalBonus = 200;
      double attendanceBonusLow = 1.1;
      double attendanceBonusHigh = 1.2;
   
      System.out.print("Please enter your Salary: ");
      double salary = keyboardIn.nextDouble();
   
      System.out.print("Please enter your sales : ");
      double sales = keyboardIn.nextDouble();
   
      System.out.print("Please enter your missing days : ");
      int missingDays = keyboardIn.nextInt();
   
      // if less than 20 missing day, all boni apply, else nothing
      // - if less than 20 days, figure out which specific bonus applies
      if(missingDays<=20)
      {
       bonusEarned = salary * bonusPerc;
       if(sales>6000) bonusEarned = bonusEarned+ additionalBonus;
       if(missingDays>2 && missingDays<=6) bonusEarned = bonusEarned*attendanceBonusLow;
       if(missingDays<=2) bonusEarned = bonusEarned* attendanceBonusHigh;
       System.out.println(bonusEarned + " Euro is your bonus");
     
      }
   
      else 
      {
      System.out.println("I say no to your bonus Sir!");      
      }
     
  
     
   }
}