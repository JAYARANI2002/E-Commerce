import java.util.*;
import java.sql.*;
public class WebsiteMain
{
   static Scanner sc=new Scanner(System.in);
   
   public static void main(String args[])throws Exception
   {
      TableCreate create=new TableCreate();
      create.createCategoryTable();
      create.createCustomerTable();
      create.createAdminTable();
      create.createProductTable();
      shopping();
    }
    public static void shopping()throws Exception
    {
     while(true)
     {
       System.out.println("----------------------");
       System.out.println("|  1. Admin           |");
       System.out.println("|  2. Customer        |");
       System.out.println("----------------------");
       
       System.out.println("Enter the choice");
       int choice=sc.nextInt();
       switch(choice)
       {
          case 1:
          {
             new AdminController(new AdminView(),new AdminModel());
             break;
          }
          case 2:
          {
             new CustomerView().displayCustomer();
             break;
          }
       }
     }
    }
}
