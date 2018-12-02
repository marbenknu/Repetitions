public class BankAccount
{
  
   private String name;
   private double balance;
   private double transactionFee = 0.0;
   private double transferFee = 5.00;
   
   public BankAccount()
   {
      this.name = "";
      this.balance = 0.0;
   }
   
   public BankAccount(String name, double balance)
   {
      this.name = name;
      this.balance = balance;
   }
   
   public String toString()
   {
      String a = "";
      a += name+", $"+balance;
      return a;
   }
  
   public void deposit(double amount)
   {
      balance = balance + amount;
   }

   public void withdraw(double amount)
   {
      if ((amount+transactionFee) > balance)
      {
         System.out.println("You dont have enough money to withdraw");
      }   
      
      else
      {
         balance = balance - (amount+transactionFee);   
      }
   } 
   
   public void transfer(BankAccount acc, double amount)
   {
      if (amount < transferFee)
      {
         System.out.println("You dont have enough money to withdraw");
      }
      else if(balance < (amount+transferFee)) 
      {
         acc.deposit(balance);
         balance = 0;
      }
      else
      {
         acc.deposit(amount);
         balance -= (transferFee+amount);
      }
   }   
}