import java.util.Scanner;

 public class counter2
{

public static void main(String [] args)

 { Scanner keyboardIn = new Scanner(System.in);
  
  
  System.out.println("How many Items are in your basket?");
  int items = keyboardIn.nextInt();
 
 int counter =1;
 double value =0;
 double money2=0;
 double i =0;;

   while(counter<=items)
    {
       System.out.println("Please enter price for Item "+counter+ ":" );
       value = keyboardIn.nextDouble();
       i+= value; 
       counter++;
       
    }

System.out.println("The total is: " + i);
System.out.println("How much money did you hand me?");
double money = keyboardIn.nextDouble();

    while(money<i){
         System.out.println("Another "+(i-money) +" are due.");
         System.out.println("Please hand more money");
          money2 = keyboardIn.nextDouble();
          
          money += money2;
     }
i=money-i;
System.out.println("Your change is: " + i);

    
    

 }
}
