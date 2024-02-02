class Account
{
   Bank bank;
   Customer customer;
   long accountNo;
   String username,password;
   double amount;
   Account(Bank bank,Customer customer,long accountNo,double amount,String username,String password)
   {
      this.bank=bank;
      this.customer=customer;
      this.accountNo=accountNo;
      this.username=username;
      this.password=password;
      this.amount=amount;
   }
   public Bank getBankObject()
   {
       return bank;
   }
   public Customer getCustomer()
   {
       return customer;
   }
   public long getAccountNumber()
   {
      return accountNo;
   }
   public String getUserName()
   {
       return this.username;
   }
   public String getUserPassword()
   {
       return this.password;
   }
   public double getAmount()
   {
       return this.amount;
   }
}
       
