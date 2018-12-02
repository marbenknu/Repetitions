import java.util.Scanner;

public class Opgave8
{
   public static void main (String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      printAverage(userInput);      
   }

   public static void printAverage(Scanner userInput)
   {
      System.out.println("Please enter x diffrent numbers" + 
      "Type a negative number to get the average number");
      
      System.out.println("Enter a number");
      
      int value = userInput.nextInt();
      int ticker = 1;
      int sum = value;
      
      while(true)
      {
      System.out.println("Enter a number");
      value = userInput.nextInt();
      if (value < 0)
      {
         break; 
      }
      sum += value;
      ticker++;
      }    
      System.out.println("Average value: " + ((double)sum/ticker));
   }
}