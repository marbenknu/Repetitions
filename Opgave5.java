import java.util.Scanner;
import java.util.*;

public class Opgave5
{
   public static void main(String args[])
   {
      smallestLargest();   
   }
   public static void smallestLargest()
   {
      Scanner userInput = new Scanner(System.in);
      
      int[] tal = new int[4];
      tal[0] = userInput.nextInt();
      tal[1] = userInput.nextInt();
      tal[2] = userInput.nextInt();
      tal[3] = userInput.nextInt();
      
      Arrays.sort(tal);
      
      System.out.println("Number 1: " + tal[0]);
      System.out.println("Number 2: " + tal[1]);
      System.out.println("Number 3: " + tal[2]);
      System.out.println("Number 4: " + tal[3]);  
      
      System.out.println("Largest number is: "+tal[3]);
      System.out.println("Smallest number is: "+tal[0]);
       
        
   }
}