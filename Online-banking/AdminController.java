class AdminController
{
    private AdminDAO admindao;
    private AdminView adminview;
    
    public AdminController(AdminDAO admindao,AdminView adminview)
    {
         this.admindao=admindao;
         this.adminview=adminview;
    }
    public void displayMenu()
    {
       Setup s=new Setup();
       s.createAdminTable();
       adminview.displayAdminMenu();
    }
 }
