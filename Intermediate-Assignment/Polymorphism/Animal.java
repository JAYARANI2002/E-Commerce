/*
Create a class called "Animal" with a method called "speak" that prints out a message such as "The animal says roar". Create subclasses such as "Dog" and "Cat" that override the speak method to print out "The dog says woof" and "The cat says meow" respectively.
*/
public class Animal
{
    void speak()
   {
       System.out.println("The animal says roar");
   }
}
class Dog extends Animal
{
    void speak()
   {
       System.out.println("The dog says woof");
   }
}
class Cat extends Animal
{
   void speak()
   {
       System.out.println("The cat says meow");
   }
}  
class MainClass
{
   public static void main(String args[])
   {
       Animal a=new Animal();
       //a.speak();
       Dog d =new Dog();
       d.speak();
   }
}
