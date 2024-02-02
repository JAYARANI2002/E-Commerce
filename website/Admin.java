import java.util.*;
public class Admin
{
   static Scanner sc=new Scanner(System.in);
   private String name,username,password;
   Admin(){}
   Admin(String name,String username,String password)
   {
      this.name=name;
      this.username=username;
      this.password=password;
   }
   public void setName(String newName)
   {
      name=newName;
   }
   public void setUserName(String newUserName)
   {
      username=newUserName;
   }
   public void setPassword(String newPassword)
   {
      password=newPassword;
   }
   public String getName()
   {
       return this.name;
   }
   public String getUserName()
   {
       return this.username;
   }
   public String getUserPassword()
   {
       return this.password;
   }
   Admin getAdminDetails()
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
         if(new AdminController().validatePassword(pass))
         {
             admin=new Admin(name,uname,pass);
         }
         else
         {
           System.out.println("Enter valid details");
         }
         return admin;
    }
    String getPassword()
   {
        System.out.println("Enter the password maximum 8 digit");
        String password=sc.next();
        return password;
   }
}
