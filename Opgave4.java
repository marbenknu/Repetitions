public class Opgave4
{

   public static void main (String[] args)
   {
      //Denne l�kke k�rer 10 gange.
      for (int i = 1; i <= 10; i++)
      {
         //Denne l�kke k�rer 10 * 10 = 100 gange.
         for (int j = 1; j <= 10; j++)
         {
            //Udskriv resultatet og lav et tabulator mellemrum
            System.out.print( i * j + "\t" );
         }
   
         //lav nyt linjeskift.
         System.out.print( "\n" );
      }
   }
}