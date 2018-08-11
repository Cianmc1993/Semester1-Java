import java.util.Scanner;
 
 public class caProgramming
{ 
 
public static void main(String [] args)
 
 { Scanner keyboardIn = new Scanner(System.in);
    
   double carBonus =0;
   double vanBonus = 0;
   double totalBonus =0;
   int yearsBonus = 0;
    
   //Input
   System.out.print("Please enter your employee type (S for Sales, M for Mechanic) : ");
   String empType = keyboardIn.next();
       
   System.out.print("Please enter your annual Salary: ");
   double salary = keyboardIn.nextDouble();
    
   System.out.print("How many years did you work for us : ");
   int years = keyboardIn.nextInt();
    
   System.out.print("How many cars did you sell this month : ");
   int soldCars = keyboardIn.nextInt();
    
   System.out.print("How many vans did you sell this month : ");
   int soldVans = keyboardIn.nextInt();
    
  //Output
   if(!(empType.equalsIgnoreCase("m")) || !(empType.equalsIgnoreCase("s")))
            System.out.println("Invalid employee typ. ");
    
   if(empType.equalsIgnoreCase("m"))
   {
            System.out.println("Monthly Pay details: ");
            System.out.println("Annual salary: " + salary);
            System.out.println("Monthly salary: " + salary/12);
   }
    
   if(empType.equalsIgnoreCase("s") && years<2 && years>=0)
   {
            System.out.println("Monthly Pay details: ");
            System.out.println("Annual salary: " + salary);
            System.out.println("Monthly salary: " + salary/12);
            System.out.println("As you have worked here for less than two years, you do not qualify for a bonus.");
            System.out.println("Total payment for this month : " + salary/12);
            System.out.println("This month you sold : " +soldVans+ " Van/-s " +soldCars+ " Car/-s.");        
   }
    
   if(empType.equalsIgnoreCase("s") && years>1)
   {
            System.out.println("Monthly Pay details: ");
            System.out.println("Annual salary: " + salary);
            System.out.println("Monthly salary: " + salary/12);
            //car sale bonus
            if(soldCars ==0) carBonus= 0;
            if(soldCars ==1) carBonus= salary*0.05;  
            if(soldCars >1 && soldCars<5) carBonus= salary*0.07;  
            if(soldCars >4) carBonus= salary*0.1; 
            System.out.println("Car sales bonus: " + carBonus);
            //van sale bonus
            if(soldVans<=5 && soldVans>=0) vanBonus = soldVans * 1000;
            if(soldVans>5) vanBonus = 5000 + (soldVans-5)*1200;
            System.out.println("Van sales bonus: " + vanBonus);
            //long service
            if(years>5) yearsBonus = 750;
            System.out.println("Long service bonus: " + yearsBonus);
            //total bonus
            totalBonus = carBonus + vanBonus + yearsBonus;
            System.out.println("Total bonus : " + totalBonus);
            //
            System.out.println("Total payment for this month : " + (salary/12 + totalBonus));
            System.out.println("This month you sold : " +soldVans+ " Van/-s " +soldCars+ " Car/-s.");        
            }
         
   }
}