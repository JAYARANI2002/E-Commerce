class AdminController
{
    private AdminView view;
    private AdminModel model;
    public AdminController(){}
    AdminController(AdminView view,AdminModel model)
    {
         this.view=view;
         this.model=model;
    }
    public void adminProcess()
    {
        view.displayAdmin();
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
         
