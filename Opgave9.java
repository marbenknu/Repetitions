import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;

public class Opgave9
{
   public static void main (String [] args) 
      throws FileNotFoundException
   {
      Scanner userInput = new Scanner(new File("input.txt"));
      collapseSpaces(userInput);
   }
   
   public static void collapseSpaces(Scanner userInput)
   {
      ArrayList<String> words = new ArrayList<String>();
      userInput.useDelimiter(" ");
      
      while(userInput.hasNext())
      {
         String word = userInput.next();
         if (!word.equals(""))
         {
            words.add(word);         
         }  
      } 
      
      for (int i = 0; i<words.size(); i++)
      {
         System.out.print(words.get(i) + " ");
      }           
   }
}