public class Customer
{
     private String name,address,email;
     private long phoneno;
     Customer(String name,String address,String email,long phoneno)
     {
         this.name=name;
         this.address=address;
         this.email=email;
         this.phoneno=phoneno;
     }
     public String getName()
     {
          return name;
     }
     public String getAddress()
     {
          return address;
     }
     public String getEmail()
     {
          return email;
     }
     public long getPhoneno()
     {
          return phoneno;
     }
     
}
