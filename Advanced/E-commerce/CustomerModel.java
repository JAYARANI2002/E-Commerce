public class CustomerModel
{
   public boolean validateCustomer(String username,String password) throws Exception
   {
        String validateCustomer="Select password from Customer where username=?";
        PreparedStatement execute_validateCustomer=new DataBaseController().createPreparedStatement(validateCustomer);
        execute_validateCustomer.setString(1,username);
        ResultSet rs1=execute_validateCustomer.executeQuery();
        if(rs1.next())
        {
           String pass=rs1.getString(1);
           if(pass.equals(password))
           {
               return true;
           }
        }
        return false;
   }
   public void addCustomer(Customer customer)
   {
        try
        {
              String addCustomer="insert into Customer (name,username,password,location) values(?,?,?,?)";
              PreparedStatement execute_addCustomer=new DataBaseController().createPreparedStatement(addCustomer);
              execute_addCustomer.setString(1,customer.getName());
              execute_addCustomer.setString(2,customer.getUserName());
              execute_addCustomer.setString(3,customer.getPassword());
              execute_addCustomer.setString(4,customer.getLocation());
              execute_addCustomer.executeUpdate();
        }
        catch(SQLException e)
        {
              System.out.println("Data not inserted");
        }
   } 
}
