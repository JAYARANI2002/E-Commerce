//Create a class called "Person" with properties such as "name", "age", and "address". Create a subclass called "Student" that inherits from the Person class and adds properties such as "grade" and "school".
class Address
{
   int doorNo;
   String street;
   String city;
   String state;
   int pincode;
   Address(int doorNo,String street,String city,String state,int pincode)
   {
        this.doorNo=doorNo;
        this.street=street;
        this.city=city;
        this.state=state;
        this.pincode=pincode;
   }
   public String toString()
   {
       return "["+this.doorNo+" ,"+this.street+" ,"+this.city+" ,"+this.state+" ,"+this.pincode+"]";
   }
}
class Person
{
   String name;
   Address address;
   int age;
   Person(String name,Address address,int age)
   {
       this.name=name;
       this.address=address;
       this.age=age;
   }
}

class Student extends Person
{
    char grade;
    String school;
    Student(String name,Address address,int age,char grade,String school)
    {
        super(name,address,age);
        this.grade=grade;
        this.school=school;
    }
    public String toString()
    {
        return this.name+" "+this.age+" "+this.address+" "+this.grade+" "+this.school;
    }
}
public class PersonClass
{
    public static void main(String args[])
    {
        Address obj = new Address(4,"ABC","Srivi","TN",626125);
        Student student=new Student("V",obj,12,'O',"SHCHS");
        System.out.println(student);
    }
}
