public class Customer
{
     private String username,name,password;
     private Address location;
     Customer(){}
     Customer(String name,String username,String password,Address location)
     {
          this.name=name;
          this.username=username;
          this.password=password;
          this.location=location;
     }
     public String getPassword()
     {
          return password;
     }
     public String getName()
     {
          return name;
     }
     public String getUserName()
     {
          return username;
     }
     public Address getLocation()
     {
          return location;
     }
     
}
