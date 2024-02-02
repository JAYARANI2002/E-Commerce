//Create a class called "Employee" with properties such as "name", "salary", and "hireDate". Implement the necessary getter and setter methods for each property.
import java.util.*;
import java.text.ParseException;  
import java.text.SimpleDateFormat;   
class Employee
{
      private String name;
      private float salary;
      private Date hireDate;
      public Employee(String name,float salary,Date hireDate)
      {
          this.name=name;
          this.salary=salary;
          this.hireDate=hireDate;
      }
      public void setname(String name)
      {
         this.name=name;
      }
      public void setsalary(float salary)
      {
         this.salary=salary;
      }
      public void sethireDate(Date date)
      {
         this.hireDate=date;
      }
      public String getName()
      {
         return this.name;
      }
      public float getSalary()
      {
         return this.salary;
      }
      public Date gethiredate()
      {
          return this.hireDate;
      }
      public String toString()
      {
          return getName()+ " "+getSalary()+" "+gethiredate();
      } 
}
public class EmployeeClass
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the hire date in [dd/MM/yyyy] format");
      String date=sc.next();
      Date hire=null;
      SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
      try
      {
         hire=format.parse(date);
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      Employee employee=new Employee("V",120000,hire);
      System.out.println(employee);
   }
} 
       
