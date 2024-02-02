/*
Create a class called "Animal" with properties such as "name", "age", and "species". Create a subclass called "Dog" that inherits from the Animal class and adds properties such as "breed" and "color".
*/
import com.animal.Animal;
class Dog extends Animal
{
      String name;
      String species;
      int age;
      String breed;
      String color;
      Dog(String name,int age,String species,String breed,String color)
      {
         super(name,age,species);
         this.name=name;
         this.age=age;
         this.species=species;
         this.breed=breed;
         this.color=color;      
      }
}
public class AnimalClass
{
   public static void main(String args[])
   {
      Dog d=new Dog("dory",1,"mammals","Shepherd","black");
      System.out.println(d.name +"  "+d.age +" "+d.species+ "  "+d.breed +" "+d.color);
      System.out.println(d.name);
   }
}
