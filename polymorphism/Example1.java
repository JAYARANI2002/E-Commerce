public class Example1
{
    public static void main(String args[])
    { 
          Dog dog=new Dog();
          dog.speek();
    }
}
class Animal
{
    public void speek()
    {
        System.out.println("the animal speeks");
    }
}
class Dog extends Animal
{
    public void speek()
    {
        System.out.println("the dog is barks");
    }
}

