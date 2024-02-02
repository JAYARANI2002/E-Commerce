/*

Create an interface called "Playable" with a method called "play". Create classes such as "Guitar" and "Piano" that implement the "Playable" interface.
*/
interface Playable
{
   abstract void play();
}
class Instruments
{
}
class Guitar extends Instruments implements Playable
{
   void play()
   {
      System.out.println("music raise while play the strings");
   }
}
class Piano implements Playable
{
   void play()
   {
      System.out.println("play the keyboard");
   }
}
class ExampleProgram
{
   public static void main(String args[])
   {
       Piano p=new Piano();
       p.play();
       Guitar g=new Guitar();
       g.play();
   }
}
