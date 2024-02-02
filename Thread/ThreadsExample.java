import java.io.*;
public class ThreadsExample extends Thread
{
   public static void main(String  args[])throws InterruptedException
   {
      Thread t1=new ThreadsExample();
      t1.start();Thread.sleep(120000);
      Thread.sleep(200);
      t1.interrupt();
      System.out.println("The thread is started");
      System.out.println("The current running thread "+Thread.currentThread().getName());
   }
   public void run()
   {
      System.out.println("Thread is running");
      
      System.out.println("The current running thread "+Thread.currentThread().getName());
   }
} 
