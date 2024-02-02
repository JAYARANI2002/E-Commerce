import java.util.*;
public class AdminView 
{
   static Scanner sc=new Scanner(System.in);
   public void displayAdmin()throws Exception
   {
     while(true)
     {
                 System.out.println("*******************");
                 System.out.println("*  1.Create Admin *");
                 System.out.println("*  2.Login        *");
                 System.out.println("*******************");
                 System.out.println("select choice");
                 int c=sc.nextInt();
                 switch(c)
                 {
                    case 1:
                    {
                        new AdminModel().insertAdmin(new Admin().getAdminDetails());
                        break;
                    }
                    case 2:
                    {
                          System.out.println("Enter the username");
                          String u_name=sc.next();
                          System.out.println("Enter the password");
                          String password=sc.next();
                          if(new AdminModel().validateCustomer(u_name,password))
                          {
                                adminWork();
                          }
                          break;
                    }
                 }
      }
    }
    public void adminWork()
    {
                  while(true)
                            {
                                System.out.println(" _________________________ ");
                                System.out.println("|1. Add Product           |");
                                System.out.println("|2. delete                |");
                                System.out.println("|3. maintain stock        |");
                                System.out.println("|_________________________|");
                                System.out.println("\n\n Enter the choice");
                                int c1=sc.nextInt();
                                switch(c1)
                                {
                                    case 1:
                                    {
                                        
                            }
}
         
