import java.util.Scanner;

 public class holidays6
{ 

public static void main(String [] args)

 { Scanner keyboardIn = new Scanner(System.in);
    //not needed from the Question
   System.out.println("Will it be a Multi-Trip? (Multi) or a Single-Trip? (Single) ");
   String trip = keyboardIn.next();
   System.out.println("Please enter the amount of people travelling: ");
   int people = keyboardIn.nextInt();
   System.out.println("Do you carry sports equipment? ");
   String sportsEquipment = keyboardIn.next();
   System.out.println("Are you a student? ");
   String student = keyboardIn.next();
   System.out.println("Are you travelling within Europe? ");
   String europe = keyboardIn.next();
   System.out.println("How long is your trip in days? ");
   int days = keyboardIn.nextInt();
   
   //The Code runs sequential, that means the percentage applies on the latest known price
   //In the question it is not clear when the % discount applies to the price, do they
   // apply on the base charge or do they apply on the base charge + whatever applies
   
  double price =0;
   
          if (trip.equalsIgnoreCase("single"))price=0;
          else if (trip.equalsIgnoreCase("multi")) price=20;
                
          if(people ==1)price = price +40;
          else if(people ==2)price = price+60;
          else if(people>2)price = price+80;
          else System.out.println("Please enter a valid entry.");
            
          if(sportsEquipment.equalsIgnoreCase("yes"))price = price*1.1;
            
          if(europe.equalsIgnoreCase("yes"))price = price*0.9;
            
          if(days>30)price = price*1.05;
            
          if(student.equalsIgnoreCase("yes"))price = price*1.1;
            
          System.out.println("Your price is " +price+ " Euro");
           
           
            
      

   
   

              
              
     
 }
}