import java.util.Scanner;
public class Customer
{
   static Scanner sc=new Scanner(System.in);
   private String name,username,contact,password;
   private Address address;
   Customer(){}
   Customer(String name,String username,String password,Address address,String contact)
   {
      this.name=name;
      this.username=username;
      this.password=password;
      this.address=address;
      this.contact=contact;
   }
   public void setAddress(Address newAddress)
   {
      address=newAddress;
   }
   public Address getAddress()
   {
       return this.address;
   }
   public String getContact()
   {
       return this.contact;
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
   Customer getCustomerDetails()
   {
         System.out.println("----------------------");
         System.out.println("Enter the name");
         String name=sc.next();
         System.out.println("Enter the username");
         String uname=sc.next();
         System.out.println("Enter the password");
         String pass=getPassword();
         if(new CustomerController().validatePassword(pass))
         {
              System.out.println("proceed.........");
         }
         System.out.println("Enter the Address");
         Address address=new Address().getAddressDetails();
         System.out.println("Enter the contact no");
         String contact=sc.next();
         System.out.println("----------------------");
         Customer customer=new Customer(name,uname,pass,address,contact);
         return customer;
    }
    String getPassword()
    {
        System.out.println("Enter the password maximum 8 digit");
        String password=sc.next();
        return password;
    }

}
