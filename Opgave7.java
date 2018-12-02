import java.util.Scanner;
import java.util.Random;

public class Opgave7
{
   public static void main (String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      diceSum(userInput);   
   }
   
   public static void diceSum(Scanner userInput)
   {
      System.out.println("Enter a sum between 2 and 12");
      int sumChoice = userInput.nextInt();
      Random dice = new Random();
      int diceSum1 = 0; 
      int diceSum2 = 0;
      
      while((diceSum1+diceSum2) != sumChoice)
      {
         diceSum1 = (dice.nextInt(6)+1); 
         diceSum2 = (dice.nextInt(6)+1);
         System.out.println(diceSum1 + " and " + diceSum2 + " = " + (diceSum1+diceSum2));
      }
   }
}