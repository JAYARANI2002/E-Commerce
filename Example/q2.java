//Implement a PriorityQueue in Java that stores a set of tasks with priorities. Use a custom Comparator to define the order of tasks. Demonstrate the use of add(), remove(), and peek() methods.
import java.util.*;
public class q2
{
   public static void main(String args[])
   {
      PriorityQueue<Task> queue=new PriorityQueue<>(3,new Priority());
      Task t1=new Task("task1",3);
      Task t2=new Task("task2",4);
      Task t3=new Task("task3",1);
      Task t4=new Task("task4",2);
      Task t5=new Task("task5",0);
      Task t6=new Task("task6",7);
      queue.add(t1);
      queue.add(t2);
      queue.add(t3);
      queue.add(t4);
      queue.add(t5);
      queue.add(t6);
      System.out.println("Order of the task");
      while(!queue.isEmpty())
      {
         System.out.println(queue.poll().getTask());
      }
      System.out.println("Add the new task");
      System.out.println("Remove the task");
      System.out.println();
   }
}
class Priority implements Comparator<Task>
{
   public int compare(Task t1,Task t2)
   {
      if(t1.priority<t2.priority)
      {
           return 1;
      }
      else if(t1.priority>t2.priority)
      {
           return -1;
      }
      else
      {
          return 0;
      }
   }
}
class Task
{
   String task;
   int priority;
   Task(String t,int priority)
   {
       task=t;
       this.priority=priority;
   }
   public String getTask()
   {
       return this.task;
   }
}
