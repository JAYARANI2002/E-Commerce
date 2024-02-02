//E-commerce 
import java.util.*;
public class E_Commerce
{
   static Scanner sc=new Scanner(System.in);
   public static void main(String args[])throws Exception
   {
     Managing_Website m=new Managing_Website();
     m.createCategoryTable();
     m.createCustomerTable();
     m.createAdminTable();
     m.createProductTable();
     
     while(true)
     {
       System.out.println("----------------------");
       System.out.println("1. Admin");
       System.out.println("2. Customer");
       System.out.println("----------------------");
       
       System.out.println("Enter the choice");
       int choice=sc.nextInt();
       switch(choice)
       {
          case 1:
          {
             l3:
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
          case 2:
          {
              l4:
              while(true)
              {
                   System.out.println("\n \n");
                   System.out.println("1. New user");
                   System.out.println("2. login");
                   System.out.println("3. forgot password");
                   System.out.println("4. EXIT");
                   System.out.println("\n \n");
                   System.out.println("Enter the choice");
                   int select=sc.nextInt();
                   switch(select)
                   {
                       case 1:
                       { 
                             Customer customer=getCustomerDetails();
                             m.addCustomer(customer);
                             break;
                       }
                       case 2:
                       {
                          System.out.println("Enter the username");
                          String u_name=sc.next();
                          System.out.println("Enter the password");
                          String password=sc.next();
                          if(m.validateCustomer(u_name,password))
                          {
                              loginCustomer(m,m.getCustomerId(u_name));
                            
                         }
                         else
                         {
                                System.out.println("Username/password invalid");
                         }
                      }
                      case 4:
                        break l4;
               }      
          } 
            
      }
    }
    }
   } 
    static void loginAdmin(Managing_Website m)throws Exception
    {
             System.out.println("Enter the username");
             String user_name=sc.next();
             System.out.println("Enter the password");
             String password=sc.next();
             if(m.validateAdmin(user_name,password))
             {
                System.out.println("Login successful");
                l2:
                while(true)
                {
                    System.out.println(" -----------------------");
                    System.out.println("|   1. Add Product      |");
                    System.out.println("|   2. Remove Product   |");
                    System.out.println("|   3. Add Category     |");
                    System.out.println("|   4. Maintain         |");
                    System.out.println("|   5. EXIT             |");
                    System.out.println(" ----------------------- ");
                    System.out.println("Enter the option");
                    
                    int option=sc.nextInt();
                    switch(option)
                    {
                        case 1:
                        {
                           Product product=getProduct();
                           m.addProduct(product);
                           break;
                        }
                        case 2:
                        {
                           System.out.println("Enter the Product code");
                           int code=sc.nextInt();
                           m.removeProduct(code);
                           break;
                        }
                        case 3:
                        {
                           m.addCategory();
                           break;
                        }
                        case 4:
                        {
                            
                           //m.maintainWebsite();
                        }
                        case 5:
                        {
                            break l2;
                        }
                   }
                }
              }
              else
              {
                  System.out.println("Access Denied");
              }
     }
     public static void loginCustomer(Managing_Website m,int customer_id)
     {
           l1:
           while(true)
                            {
                                System.out.println(" _________________________");
                                System.out.println("|1. purchase              |");
                                System.out.println("|2. cancel                |");
                                System.out.println("|3. return                |");
                                System.out.println("|4. EXIT                  |");
                                System.out.println("|_________________________|");
                                System.out.println("\n\n Enter the choice");
                                int opinion=sc.nextInt();
                                switch(opinion)
                                {
                                     case 1:
                                     {
                                         System.out.println("Search the category");
                                         new Product().displayCategory();
                                         String category=sc.next();
                                         m.selectProduct(category);
                                         System.out.println("Enter the product id");
                                         int id=sc.nextInt();
                                         if((m.showAvailability(id)).equals("IN STOCK"))
                                         {
                                              m.displayProduct(id);
                                              System.out.println("Enter the code");//stock-code
                                              
                                         }
                                         
                                         purchase(customer_id,sc.nextInt(),m);
                                         break;
                                     }
                                     case 4:
                                         break l1;
                                }
                            }
    }
    public static void purchase(int customer_id,int stock_id,Managing_Website m)
    {
        while(true)
        {
             System.out.println("Add to cart");
             System.out.println("Buy product");
             System.out.println("Exit");
             System.out.println("Enter the choice");
             switch(sc.nextInt())
             {
                 case 1:
                 {
                     ArrayList<Integer> cart =new ArrayList<>();
                     cart.add(stock_id);
                     break;
                 }
                 case 2:
                 {
                     m.placeOrder(stock_id,customer_id);
                     break;
                 }
                 case 3:
                 {
                    System.exit(0);
                 }
             }
        }
    }
    static  Product getProduct()
    {
           System.out.println("Enter the product code");
           int code=sc.nextInt();
           System.out.println("Enter the Product name");
           String name=sc.next();
           System.out.println("Enter the Prouct price");
           float price=sc.nextFloat();
           return new Product(code,name,price);
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
