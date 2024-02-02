import java.sql.*;
import java.util.*;
class AdminView
{
   static Scanner sc=new Scanner (System.in);
   public void displayAdminMenu()
   {
      while(true)
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
                        new AdminDAO().insertAdmin(admin);
                        break;
                    }
                    case 2:
                    {
                        loginAdmin();
                        break;
                    }
                    case 3:
                       
                }
              }
     }
     public void loginAdmin()
     {
         try
         {
            System.out.println("Enter the username");
             String user_name=sc.next();
             System.out.println("Enter the password");
             String password=sc.next();
             if(new AdminDAO().validateAdmin(user_name,password))
             {
                System.out.println("Login successful");
             }
         }
         catch(Exception e)
         {
            System.out.println(e);
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
