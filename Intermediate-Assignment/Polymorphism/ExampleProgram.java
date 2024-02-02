/*

Create an interface called "Playable" with a method called "play". Create classes such as "Guitar" and "Piano" that implement the "Playable" interface.
*/
interface Playable
{
   public abstract void play();
}

class Guitars implements Playable
{
   public void play()
   {
      System.out.println("music raise while play the strings");
   }
}
class Piano implements Playable
{
  public void play()
   {
      System.out.println("play the keyboard");
   }
}
public class ExampleProgram
{
   public static void main(String args[])
   {
       Piano p=new Piano();
       p.play();
       Guitars g=new Guitars();
       g.play();
   }
}
