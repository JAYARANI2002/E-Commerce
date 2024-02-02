
/*public  class ThreadExample1 extends Thread
{
   public static void main(String args[])
   {
      ThreadExample1 t1=new ThreadExample1();
      t1.start();
   }

}*/
/* public class ThreadExample1 implements Runnable
{
   public static void main(String args[])
   {
      Thread t=new Thread(new ThreadExample1());
      t.run();
   }
   public void run()
   {
     System.out.println("the thread is thread");
   }

} */
 class NamedRunnable extends Thread implements Runnable {
   String name;  // The name of this Runnable.
   public NamedRunnable(String name) {  // Constructor gives name to object.
      this.name = name;
   }
   public void run() {  // The run method prints a message to standard output.
      System.out.println("Greetings from runnable '" + name +"'!");
      
     
   }
}
public class ThreadExample1
{
  public static void main(String args[]){
    NamedRunnable greetings = new NamedRunnable("Fred");
    Thread greetingsThread = new Thread(greetings);
    greetingsThread.start();
    
}
}
