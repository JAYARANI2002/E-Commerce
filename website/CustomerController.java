public class CustomerController
{
    
   public  boolean validatePassword(String password)
   {
      while(true)
      {
       if(password.length()==8)
       {
           return true;    
       }
       else
       {
          password=new Admin().getPassword();
       }
      }
   }
   

}
         
