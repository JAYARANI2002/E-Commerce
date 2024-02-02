import java.sql.*;
import java.util.*;
import java.time.*;
import java.text.*;
import java.time.format.DateTimeFormatter;
class Management
{
   static Connection c;
   static Scanner sc=new Scanner(System.in);
   static
   {
       try
       {
            c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/onlinebanking","postgres","1234");
       }
       catch(Exception e)
       {
            System.out.println("Connection fail...");
       }
   }
   public void createTransactionTable()
   {
      try{
       String createTable="create table if not exists Transaction (id serial primary key,Transact_to int references account(id),Receieve_from int references account(id),amount NUMERIC(10,2),current_balance NUMERIC(10,2),time timeStamp);";
        PreparedStatement execute_createTable=c.prepareStatement(createTable);
          execute_createTable.execute();
         }
       catch(SQLException e)
       {
            System.out.println(e);
       }
    }
   public void createCustomerTable()
    {
       try
       {  
          String createTable="create table if not exists Customer(id serial primary key,name varchar(20) not null,place varchar(1000),email varchar(20) unique,phoneno bigint not null );";
          PreparedStatement execute_createTable=c.prepareStatement(createTable);
          execute_createTable.execute();
       }
       catch(SQLException e)
       {
            System.out.println(e);
       }
   }
   public void createBankTable()
   {
       try
       {  
          String createTable="create table if not exists Bank(id serial primary key,name varchar(100) not null,branch varchar(80) not null,place varchar(1000),email varchar(20) unique,phoneno int not null,IFSC_code varchar(15) unique );";
          PreparedStatement execute_createTable=c.prepareStatement(createTable);
          execute_createTable.execute();
       }
       catch(SQLException e)
       {
            System.out.println(e);
       }
   } 
   public void createAdminTable()
   {
      try
      {
         String createAdmin_Table="create table if not exists Admin (id serial primary key,name varchar(15),username varchar(10) not null unique,password varchar(8));";
         PreparedStatement execute_createAdminTable=c.prepareStatement(createAdmin_Table);
         execute_createAdminTable.execute();
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
   }
   public void createAccountTable() throws SQLException
   {
       try
       {  
          String createTable="create table if not exists Account(id serial primary key,customer_id int references customer(id),bank_id int references bank(id),account_number Bigint unique ,Amount decimal(10,2) default 0,username varchar(10) unique,password varchar(8));";
          PreparedStatement execute_createTable=c.prepareStatement(createTable);
          execute_createTable.execute();
       }
       catch(SQLException e)
       {
            System.out.println(e);
       }
   }
   public void createBankAdminTable() throws SQLException
   {
       try
       {  
          String createBankAdminTable="create table if not exists BankAdmin(id serial primary key,bank_id int references bank(id),admin_id int references admin(id));";
          PreparedStatement execute_createBankAdminTable=c.prepareStatement(createBankAdminTable);
          execute_createBankAdminTable.execute();
       }
       catch(SQLException e)
       {
            System.out.println(e);
       }
   }
   public void insertAdmin(Admin admin)
   {
      try
         {
            String addAdmin="insert into Admin(name,username,password) values (?,?,?)";
            PreparedStatement execute_addAdmin=c.prepareStatement(addAdmin);
            execute_addAdmin.setString(1,admin.getName());
            execute_addAdmin.setString(2,admin.getUserName());
            execute_addAdmin.setString(3,admin.getUserPassword());
            execute_addAdmin.executeUpdate();
            System.out.println("Data inserted successfully");
         }
         catch(Exception e)
         {
            System.out.println("data is not inserted");
         }
   }
   public void insertBankAdmin(Admin admin,Bank bank)
   {
      try
         {
            String addBankAdmin="insert into BankAdmin(bank_id,admin_id) values (?,?)";
            PreparedStatement execute_addBankAdmin=c.prepareStatement(addBankAdmin);
            execute_addBankAdmin.setInt(1,getBankId(bank));
            execute_addBankAdmin.setInt(2,getAdminId(admin));
            execute_addBankAdmin.executeUpdate();
            System.out.println("Data inserted successfully");
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
   }
   public void insertCustomer(Customer customer)
   {
      try
         {
            String addcustomer="insert into Customer(name,place,email,phoneno) values (?,?,?,?)";
            PreparedStatement execute_addcustomer=c.prepareStatement(addcustomer);
            execute_addcustomer.setString(1,customer.getName());
            execute_addcustomer.setString(2,customer.getAddress());
            execute_addcustomer.setString(3,customer.getEmail());
            execute_addcustomer.setLong(4,customer.getPhoneno());
            execute_addcustomer.executeUpdate();
            System.out.println("Data inserted successfully");
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
   }
   public void insertAccount(Customer customer,int bank_id)
   {
      try
         {
            String addAccount="insert into account(customer_id,bank_id) values (?,?)";
            PreparedStatement execute_addAccount=c.prepareStatement(addAccount);
            execute_addAccount.setInt(1,getCustomerId(customer));
            execute_addAccount.setInt(2,bank_id);
            execute_addAccount.executeUpdate();
            System.out.println("Data inserted successfully");
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
   }
   public void addTransaction(int sender_id,int receiver_id,double amount)
   {
      try
         {
            String add="insert into Transaction(transact_to,receieve_from,amount,current_balance,time) values (?,?,?,?,?)";
            PreparedStatement execute_add=c.prepareStatement(add);
            execute_add.setInt(1,sender_id);
            execute_add.setInt(2,receiver_id);
            execute_add.setDouble(3,amount);
            execute_add.setDouble(4,getUserAmount(sender_id));
            String pattern="yyyy:MM:dd HH:mm:ss";
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern(pattern);
            LocalDateTime l=LocalDateTime.now();
            SimpleDateFormat sdf=new SimpleDateFormat(pattern);
            execute_add.setTimestamp(5,Timestamp.valueOf(l));
            int a= execute_add.executeUpdate();
            System.out.println("=====================================");
            System.out.println("Transfer for "+amount+" on "+l+" is");
            System.out.println("successfully transfered");
            System.out.println("=====================================");
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         }
   }
   public void transactionHistory(int account_id)
   {
        try
        {
            String history="select TIME,ACCOUNT_NUMBER ,TRANSACTION.AMOUNT,CURRENT_BALANCE from transaction JOIN account ON RECEIEVE_FROM=ACCOUNT.ID WHERE TRANSACT_TO=?";
            PreparedStatement execute_history=c.prepareStatement(history);
            execute_history.setInt(1,account_id);
            ResultSet rs=execute_history.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getTimestamp(1)+"\t"+rs.getLong(2)+"\t"+rs.getDouble(3)+"\t"+rs.getDouble(4));
            }
        }
        catch(SQLException e)
         {
            e.printStackTrace();
         }
        
   }
   public void updateAccount(int account_id,double amount)
   {
      try
         {
            String update="update account set amount=? where id=?";
            PreparedStatement execute_update=c.prepareStatement(update);
            execute_update.setDouble(1,getUserAmount(account_id)+amount);
            execute_update.setInt(2,account_id);
            execute_update.executeUpdate();
            System.out.println("Data updated successfully");
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
   }
   public static double getUserAmount(int accountId) 
   {
       try
       {
        String getAmount="Select amount from account where id=?";
        PreparedStatement execute=c.prepareStatement(getAmount);
        execute.setInt(1,accountId);
        ResultSet rs1=execute.executeQuery();
        if(rs1.next())
        {
           return rs1.getDouble(1);
        }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      return -1;
   }
   public long getAccountNumber(int customer_id,int bank_id)
   {
      long accNo=0;
      try
         {
            String update="select account_number from account where customer_id=? and bank_id=?";
            PreparedStatement execute_update=c.prepareStatement(update);
            execute_update.setInt(1,customer_id);
            execute_update.setInt(2,bank_id);
            ResultSet rs=execute_update.executeQuery();
            if(rs.next())
            {
                accNo=rs.getLong(1);
            }
            else
            {
               accNo=-1;
            }
            
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
         return accNo;
   }
   public Bank getBank(int bank_id)
   {
      try
         {
            String update="select * from bank where id=?";
            PreparedStatement execute_update=c.prepareStatement(update);
            execute_update.setInt(1,bank_id);
            ResultSet rs=execute_update.executeQuery();
            if(rs.next())
            {
                 String name=rs.getString(2);
                 System.out.println(name);
                 String branch=rs.getString(3);
                 String place=rs.getString(4);
                 String email=rs.getString(5);
                 int ph=rs.getInt(6);
                 String ifsc=rs.getString(7);
                 return new Bank(name,branch,place,ifsc,email,ph);
           }
            
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
         return null;
   }
   public void addBank(Bank bank)
   {
      try
         {
            String addBank="insert into Bank(name,branch,place,email,phoneNo,IFSC_code) values (?,?,?,?,?,?)";
            PreparedStatement execute_addBank=c.prepareStatement(addBank);
            execute_addBank.setString(1,bank.getName());
            execute_addBank.setString(2,bank.getBranch());
            execute_addBank.setString(3,bank.getPlace());
            execute_addBank.setString(4,bank.getEmail());
            execute_addBank.setInt(5,bank.getPh());
            execute_addBank.setString(6,bank.getIFSC_Code());
            execute_addBank.executeUpdate();
            System.out.println("Data inserted successfully");
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
   }
   public void addAccount(Account account)
   {
      try
      {
          String addAccount="insert into account (customer_id,bank_id ,account_number ,Amount ,username ,password )values (?,?,?,?,?,?);";
          PreparedStatement execute_addAccount=c.prepareStatement(addAccount);
          execute_addAccount.setInt(1,getCustomerId(account.getCustomer()));
          execute_addAccount.setInt(2,getBankId(account.getBankObject()));
          execute_addAccount.setLong(3,account.getAccountNumber());
          execute_addAccount.setDouble(4,account.getAmount());
          execute_addAccount.setString(5,account.getUserName());
          execute_addAccount.setString(6,account.getUserPassword());
          execute_addAccount.executeUpdate();
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
   }
   public void displayBank()
   {
       try
       {
            String displayBank="select * from bank;";
            PreparedStatement execute_displayBank=c.prepareStatement(displayBank);
            ResultSet rs=execute_displayBank.executeQuery();
            while(rs.next())
            {
                 System.out.print(rs.getInt(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getString(4)+"\n"+rs.getString(5)+"\n"+rs.getInt(6)+"\n");
            }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
   }
   public int validateAdmin(String username,String password) 
   {
       try
       {
        String validateAdmin="Select password,id from Admin where username=?;";
        PreparedStatement execute_validateAdmin=c.prepareStatement(validateAdmin);
        execute_validateAdmin.setString(1,username);
        ResultSet rs1=execute_validateAdmin.executeQuery();
        if(rs1.next())
        {
           String pass=rs1.getString(1);
           if(pass.equals(password))
           {
               return rs1.getInt(2);
           }
        }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
        return -1;
   }
   public int validateCustomer(int bankId,String username,String password) 
   {
       try
       {
        String validateCustomer="Select password,id from account where username=? and bank_id=?;";
        PreparedStatement execute_validateCustomer=c.prepareStatement(validateCustomer);
        execute_validateCustomer.setString(1,username);
        execute_validateCustomer.setInt(2,bankId);
        ResultSet rs1=execute_validateCustomer.executeQuery();
        if(rs1.next())
        {
           String pass=rs1.getString(1);
           if(pass.equals(password))
           {
               return rs1.getInt(2);
           }
        }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
        return -1;
   }
   public int getAccountId(long accountNo) 
   {
       try
       {
        String id="Select id from account where account_number=?";
        PreparedStatement execute_id=c.prepareStatement(id);
        execute_id.setDouble(1,accountNo);
        ResultSet rs1=execute_id.executeQuery();
        if(rs1.next())
        {
            System.out.println(rs1.getInt(1));
            return rs1.getInt(1);
        }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      return -1;
   }
   public int getCustomerId(Customer customer)throws Exception
   {
         String getId="select id from customer where name=? and email=?;";
         PreparedStatement execute_getId=c.prepareStatement(getId);
         execute_getId.setString(1,customer.getName());
         execute_getId.setString(2,customer.getEmail());
         ResultSet rs=execute_getId.executeQuery();
         if(rs.next())
         {
             return rs.getInt(1);
         }
         return -1;
  }
  public int getBankId(Bank bank)throws Exception
   {
         String getId="select id from Bank where name=? and branch=?;";
         PreparedStatement execute_getId=c.prepareStatement(getId);
         execute_getId.setString(1,bank.getName());
         System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>"+bank.getName()+" "+bank.getBranch()+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
         execute_getId.setString(2,bank.getBranch());
         ResultSet rs=execute_getId.executeQuery();
         if(rs.next())
         {
             System.out.println(rs.getInt(1));
             return rs.getInt(1);
         }
         return -1;
  }
  public int getAdminId(Admin admin)throws Exception
   {
         String getId="select id from Admin where username=? and password=?;";
         PreparedStatement execute_getId=c.prepareStatement(getId);
         execute_getId.setString(1,admin.getUserName());
         execute_getId.setString(2,admin.getUserPassword());
         ResultSet rs=execute_getId.executeQuery();
         if(rs.next())
         {
             return rs.getInt(1);
         }
         return -1;
  }
}
