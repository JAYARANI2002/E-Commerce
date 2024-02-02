import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;
public class OnlineBanking
{
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Integer> createAccount=new ArrayList<>();
    static HashMap<Integer,Long> accountNumber=new HashMap<>();
    public static void main(String args[])throws Exception
    {
        Management m=new Management();
        m.createCustomerTable();
        m.createBankTable();
        m.createAdminTable();
        m.createAccountTable();
        m.createTransactionTable();
        while(true)
        {
             System.out.println("----------------------------");
             //System.out.println("1 --> Admin                 |");
             System.out.println("2 --> Customer              |");
             System.out.println("3 --> Add Bank Details      |");
             System.out.println("4 --> Exit                  |");
             System.out.println("----------------------------");
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the choice");
             switch(sc.nextInt())
             {
               /*case 1:
               {
                l1:
                while(true)
                { 
                 System.out.println("*******************");
                 System.out.println("1. Create Admin   *");
                 System.out.println("2. Login          *");
                 System.out.println("3. EXIT           *");
                 System.out.println("*******************");
                 System.out.println("select choice");
                 int c=sc.nextInt();
                 switch(c)
                 {
                    case 1:
                    {
                        Admin admin=getAdminDetails();
                        m.insertAdmin(admin);
                        break;
                    }
                    case 2:
                    {
                        loginAdmin(m);
                        break;
                    }
                    case 3:
                    {
                        break l1;
                    }
                }
                }
                break;
                }*/
                case 2:
                    {
                      l2:
                      while(true)
                      {
                        System.out.println("*******************");
                        System.out.println("1. Create Customer");
                        System.out.println("2. Login");
                        System.out.println("3. EXIT");
                        System.out.println("*******************");
                        System.out.println("select choice");
                        Customer customer=null;
                        int c=sc.nextInt();
                        switch(c)
                        {
                           case 1:
                           {
                              l3:
                              while(true)
                              {
                                System.out.println("1 new account");
                                System.out.println("2 activate ");
                                System.out.println("3 exit");
                                switch(sc.nextInt())
                                {
                                 case 1:
                                 {
                                    customer=getCustomerDetails();
                                    m.insertCustomer(customer);
                                    customerProcess(m,customer);
                                    break;
                                 }
                                 case 2:
                                 {
                                     customerProcess(m,customer);
                                     break;
                                 }
                                 case 3:
                                     break l3;
                                }
                              }
                             
                           }
                           case 2:
                           {
                                
                                loginCustomer(m);
                                break;
                           }
                           case 3:
                                break l2;
                        }   
                    }
                    break;
                }
             case 3:
                    {
                        Bank bank=getBankDetails();
                        m.addBank(bank);
                        bankAdmin(bank,m);
                        //manageUser();
                        
                    }
                    break;
            case 4:
              System.exit(0);
          }
     }
   }
     public static void loginAdmin(Management m)
     {
         try
         {
             
             System.out.println("Enter the username");
             String user_name=sc.next();
             System.out.println("Enter the password");
             String password=sc.next();
             int admin_id=m.validateAdmin(user_name,password);
             if(admin_id!=-1)
             {
                System.out.println("Login successful");
                //adminDuty(m,admin_id);
             }
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
    }
    public static void loginCustomer(Management m)
     {
         try
         {
             m.displayBank();
             System.out.println("Enter the bank id");
             int bank_id=sc.nextInt();
             System.out.println("Enter the username");
             String user_name=sc.next();
             System.out.println("Enter the password");
             String password=sc.next();
             int account_id=m.validateCustomer(bank_id,user_name,password);
             if(account_id!=-1)
             {
                System.out.println("Login successful"+ account_id);
                customerarea(account_id,m);
             }
             else
             {
                  System.out.println("Enter the valid username/password");
             }
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
    }
    public static void customerarea(int account_id,Management m)
    {
      l1:  while(true)
        {
             System.out.println("1. money transfer");
             System.out.println("2. paybill");
             System.out.println("3. transaction history");
             System.out.println("4. logout");
             System.out.println("Enter the choice");
             switch(sc.nextInt())
             {
                  case 1:
                  {
                      System.out.println(account_id);
                      System.out.println("Enter the account number to deposit");
                      long accountNo=sc.nextLong();
                      int receieve_id=m.getAccountId(accountNo);
                      System.out.println("Enter the amount");
                      double amount=sc.nextDouble();
                      if(account_id==receieve_id)
                      {
                             m.updateAccount(receieve_id,amount);
                      }
                      else
                      {
                             m.updateAccount(account_id,amount*-1);
                             m.updateAccount(receieve_id,amount);
                      }
                      m.addTransaction(account_id,receieve_id,amount);
                      
                      break;
                  }
                  case 2:
                  {
                     System.out.println("Enter the account number to deposit");
                  }
                  case 3:
                  {
                      m.transactionHistory(account_id);
                      break;
                  }
                  case 4:
                  {
                      System.exit(0);
                  }
             }
        }
    }
   /*  public static void adminDuty(Management m,int admin_id)
    {
         l3:
         while(true)
         {
             System.out.println("1 Manage Transactions");
             System.out.println("2 close accounts");
             System.out.println("3 exit");
             switch(sc.nextInt())
             {
                case 1:
                {
                    //m.todayTransactionHistory(admin_id);
                    break;
                }
                case 3:
                {
                    break l3;
                }
             }
         }
    }*/
    public static void customerProcess(Management m,Customer customer)throws Exception
    {
         int bank_id=0;
         l2:
         while(true)
         {
              System.out.println("1. create account");
              System.out.println("2. login");
              System.out.println("3. EXIT");
              System.out.println("Enter the choice");
              switch(sc.nextInt())
              {
                   case 1:
                   {
                        bank_id=createAccount(m,customer);
                        int customerId=m.getCustomerId(customer);
                        System.out.println("customer id:"+customerId+"Bank id"+bank_id);
                        Bank bank=m.getBank(bank_id);
                        System.out.println(bank.getName());
                        System.out.println("Enter the username");
                        String user_name=sc.next();
                        System.out.println("Enter the password");
                        String password=sc.next();
                        long account_no=Long.valueOf(getAccountNumber());;
                        if (account_no!=-1) 
                        {
                              System.out.println("Deposit the initial amount > 500");
                              double amount=sc.nextDouble();
                              Account account=new Account(bank,customer,account_no,amount,user_name,password);
                              m.addAccount(account);
                        }
                        else
                        {
                             System.out.println("create account first");
                        }
                        break;
                   }
                   case 2:
                   {
                        loginCustomer(m);
                        break;
                   }
                   case 3:
                   {
                       return ;
                   }
              }
         }
   }
   public static int createAccount(Management m,Customer customer)throws Exception
   {
         m.displayBank();
         System.out.println("Enter the bank id");
         int bank_id=sc.nextInt();
         int customer_id=m.getCustomerId(customer);
         createAccount.add(customer_id);
         System.out.println("Your account is created within 12 hours");
         return bank_id;
   }
   public static long getAccountNumber()
   {

    Random r = new Random();
    long numbers = 1000000000L + (long)(r.nextDouble() * 999999999L);

    return numbers;
   }
   static Admin getAdminDetails()
    {
         Admin admin=null;
         System.out.println("----------------------");
         System.out.println("Enter the name");
         String name=sc.next();
         System.out.println("Enter the username");
         String uname=sc.next();
         System.out.println("Enter the password");
         String pass=getPassword();
         System.out.println("----------------------");
         if(validatePassword(pass))
         {
             admin=new Admin(name,uname,pass);
         }
         else
         {
           System.out.println("Enter valid details");
         }
         return admin;
     }
     static Bank getBankDetails()
    {
         Bank bank=null;
         System.out.println("----------------------");
         System.out.println("Enter the name");
         String name=sc.next();
         System.out.println("Enter the branch");
         String branch=sc.next();
         System.out.println("Enter the location");
         Address location=new Address(). getAddressDetails();
         System.out.println("Enter the email");
         String email=sc.next();
         System.out.println("Enter the ph");
         int ph=sc.nextInt();
         System.out.println("Enter the IFSC code");
         String code=sc.next();
         System.out.println("----------------------");
         bank=new Bank(name,branch,location.toString(),code,email,ph);
         return bank;
     }
     static void bankAdmin(Bank bank,Management m)
     {
         l1:
         while(true)
         {
                 System.out.println("***********************");
                 System.out.println("1. Create Bank Admin  *");
                 System.out.println("2. Login Bank Admin   *");
                 System.out.println("3. EXIT               *");
                 System.out.println("***********************");
                 System.out.println("select choice");
                 int c=sc.nextInt();
                 switch(c)
                 {
                    case 1:
                    {
                        Admin admin=getAdminDetails();
                        m.insertAdmin(admin);
                        m.insertBankAdmin(admin,bank);
                        break;
                    }
                    case 2:
                    {
                        loginAdmin(m);
                        break;
                    }
                    case 3:
                    {
                        break l1;
                    }
                }
         }
     }
     static Customer getCustomerDetails()
     {
         Customer customer=null;
         System.out.println("----------------------");
         System.out.println("Enter the name");
         String name=sc.next();
         System.out.println("Enter the location");
         Address location=new Address(). getAddressDetails();
         System.out.println("Enter the email");
         String email=sc.next();
         System.out.println("Enter the ph");
         long ph=sc.nextLong();
         System.out.println("----------------------");
         customer=new Customer(name,location.toString(),email,ph);
         
         return customer;
         
     }                  
   public static boolean validatePassword(String password)
   {
      while(true)
      {
       if(password.length()==8)
       {
           return true;    
       }
       else
       {
          password=getPassword();
       }
      }
   }
   public static String getPassword()
   {
        System.out.println("Enter the password maximum 8 digit");
        String password=sc.next();
        return password;
   }
}
          
