import java.util.Scanner;
public class question5b
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int i = 0;
      char j;
      
      System.out.print("Please enter a character: ");
      j = keyboardIn.next().charAt(0);
      
      do{
         switch(j)
            {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
               i++;
               break;
               default : break;
             }
             
             System.out.print("Please enter a character: ");
             j = keyboardIn.next().charAt(0);
      
        }
        
            while(j != '.');
            
            System.out.print("Number of vowels entered: "+i);
            
   }
}
      

             
             
            
