//Create a class called "BankAccount" with properties such as "balance", "accountNumber", and "accountType". Implement the necessary getter and setter methods for each property.
class BankAccount
{
   private float balance;
   private long accountNumber;
   private String accountType;
   BankAccount(float balance,long accountNumber,String accountType)
   {
       this.balance=balance;
       this.accountNumber=accountNumber;
       this.accountType=accountType;
   }
   public void setBalance(float newBalance)
   {
       balance=newBalance;
   }
   public float getBalance()
   {
       return this.balance;
   }
   public void setAccountNo(long newAccountNo)
   {
      accountNumber=newAccountNo;
   }
   public long getAccountNo()
   {
       return this.accountNumber;
   }
   public void setAccountType(String newAccountType)
   {
       accountType=newAccountType;
   }
   public String getAccountType()
   {
       return this.accountType;
   }
}
public class BankAccountClass
{
   public static void main(String args[])
   {
      BankAccount account=new BankAccount(1200.09f,123456789,"saving");
      System.out.println(account.getBalance());
      System.out.print("Change the account type " +account.getAccountType()+" into ");
      account.setAccountType("salary");
      System.out.print(account.getAccountType());
   }
}
