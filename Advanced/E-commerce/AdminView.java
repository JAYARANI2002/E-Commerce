class AdminView
{
   public void displayAdminMenu()
   {
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
