import java.util.*;
public class CustomerView
{
   static Scanner sc=new Scanner(System.in);
   public void displayCustomer()throws Exception
   {
            while(true)
            {
                   System.out.println("\n \n");
                   System.out.println("1. New user");
                   System.out.println("2. login");
                   System.out.println("3. forgot password");
                   System.out.println("\n \n");
                   System.out.println("Enter the choice");
                   int select=sc.nextInt();
                   switch(select)
                   {
                       case 1:
                       { 
                             Customer customer=new Customer().getCustomerDetails();
                             new CustomerModel().addCustomer(customer);
                             break;
                       }
                       case 2:
                       {
                          System.out.println("Enter the username");
                          String u_name=sc.next();
                          System.out.println("Enter the password");
                          String password=sc.next();
                          if(new CustomerModel().validateCustomer(u_name,password))
                          {
                            
                         }
                         else
                         {
                                System.out.println("Username/password invalid");
                         }
                    }
               }      
          } 
       }
 }
