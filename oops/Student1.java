 interface College
{
  void status();
}
class CollegeStatus1 implements College
{
   public void status() 
   {
         System.out.println("College is open monday to friday");
   }
}
class CollegeStatus2 implements College
{
       public void status() 
       {
                System.out.println("College is open on saturday");
       }
}
public class Student1
{
         public static void main(String args[])
         {
                
                College obj = new CollegeStatus1 ();
                public void goToCollege() {
obj.status();
}
                 //obj.status();
         }
}

