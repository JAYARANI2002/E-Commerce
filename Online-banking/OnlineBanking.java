import java.util.Scanner;
public class OnlineBanking
{
    public static void main(String args[])throws Exception
    {
        while(true)
        {
             System.out.println("1 --> Bank Admin");
             System.out.println("2 --> Bank Customer");
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the choice");
             switch(sc.nextInt())
             {
                 case 1:
                 {
                 System.out.println("*******************");
                 System.out.println("1. Create Admin");
                 System.out.println("2. Login");
                 System.out.println("3. EXIT");
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
                       break l3;
                }
             }
          }
     }
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
     static Customer getCustomerDetails()
     {
         Customer customer=null;
         System.out.println("----------------------");
         System.out.println("Enter the name");
         String name=sc.next();
         System.out.println("Enter the username");
         String uname=sc.next();
         System.out.println("Enter the password");
         String pass=getPassword();
         System.out.println("Enter the location");
         Address location=new Address(). getAddressDetails();
         System.out.println("----------------------");
         if(validatePassword(pass))
         {
             customer=new Customer(name,uname,pass,location);
         }
         else
         {
           System.out.println("Enter valid details");
         }
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
}
          
