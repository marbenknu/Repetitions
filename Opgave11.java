public class Opgave11
{
   public static void main (String [] args)
      {
         BankAccount account1 = new BankAccount("Marcus", 12.00); 
         BankAccount account2 = new BankAccount("Chunck", 88.00);
                      
         account1.deposit(20.00);

         account1.transfer(account2, 20.00);
         
         System.out.println(account1.toString());
         System.out.println(account2.toString());
         
      }
}