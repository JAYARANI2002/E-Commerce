class Admin
{
   private String name,username,password;
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
}
