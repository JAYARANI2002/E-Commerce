//Create a class called "Student" with properties such as "name", "age", and "grade". Implement the necessary getter and setter methods for each property.
class Student
{
   private char grade;
   private int age;
   private String name;
   Student(String name,int age,char grade)
   {
       this.name=name;
       this.age=age;
       this.grade=grade;
   }
   public void setName(String newName)
   {
       name=newName;
   }
   public String getName()
   {
       return this.name;
   }
   public void setAge(int newAge)
   {
      age=newAge;
   }
   public int getAge()
   {
       return this.age;
   }
   public void setGrade(char newGrade)
   {
       grade=newGrade;
   }
   public char getGrade()
   {
       return this.grade;
   }
   public String toString()
   {
       return this.getName()+" "+this.getAge()+" "+this.getGrade();
   }
}
public class StudentClass
{
   public static void main(String args[])
   {
      Student student=new Student("V",27,'O');
      System.out.println(student);
      System.out.print("Change the account type " +student.getGrade()+" into ");
      student.setGrade('A');
      System.out.print(student.getGrade());
   }
}
