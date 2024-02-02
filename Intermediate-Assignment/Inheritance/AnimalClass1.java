//Create a class called "Animal" with properties such as "name", "age", and "species". Create a subclass called "Cat" that inherits from the Animal class and adds properties such as "color" and "numLives".
import com.animal.Animal;
class Cat extends Animal
{
      String name;
      String species;
      int age;
      int numLives;
      String color;
      Cat(String name,int age,String species,int life ,String color)
      {
         super(name,age,species);
         this.name=name;
         this.age=age;
         this.species=species;
         this.numLives=life;
         this.color=color;      
      }
}
public class AnimalClass1
{
   public static void main(String args[])
   {
      Cat c=new Cat("milly",1,"mammals",12,"black");
      System.out.println(c.name +"  "+c.age +" "+c.species+ "  "+c.numLives+" "+c.color);
   }
}
