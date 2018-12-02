import java.util.Scanner;

public class Opgave6 
{

  public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Indsæt string: ");
        String str = userInput.nextLine();

        System.out.print("Antal ord i String: " + count_Words(str)+"\n");
    }

 public static int count_Words(String str)
    {
       int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count;
    }
 }