//Implement a PriorityQueue in Java that stores a set of tasks with priorities. Use a custom Comparator to define the order of tasks. Demonstrate the use of add(), remove(), and peek() methods.
import java.util.*;
public class ComparePriority
{
   public static void main(String args[])
   {
      System.out.println("Enter the queue with size");
      Scanner scan=new Scanner(System.in);
      PriorityQueue<Task> queue=new PriorityQueue<>(3,new Priority());
      /*Task t1=new Task("task1",3);
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
      queue.add(t6);*/
      Task t;
      while(true)
      {
            System.out.println("\nPriority Queue Operations\n");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. check empty");
            System.out.println("4. check full");
            System.out.println("5. clear");
            System.out.println("6. size");
            System.out.println("7. display");
            System.out.println("8. exit");
            int choice = scan.nextInt();            
            switch (choice) 
            {
            case 1 : 
                System.out.println("Enter task name and priority");
                t=new Task(scan.next(), scan.nextInt() );
                queue.add(t);                     
                break;                          
            case 2 : 
                System.out.println("\nTask removed \n\n"+ queue.remove()); 
                break;        
            case 3 : 
                System.out.println("\nEmpty Status : "+ queue.isEmpty() );
                break; 
            case 4 : 
                System.out.println("\nFull Status : "+ queue.isFull() );
                break; 
            case 5 : 
                System.out.println("\nPriority Queue Cleared");
                queue.clear();
                break;    
            case 6 : 
                System.out.println("\nSize = "+ queue.size() );
                break; 
            case 7 : 
                System.out.println("\nQueue ");
                Iterator iterator=queue.iterator();
                while(queue.hasNext())
                {
                   System.out.println(queue.next());
                }
                break;   
            case 8:
                System.exit(0);        
            default : 
                System.out.println("Wrong Entry \n ");
            }              
        }
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
   public String toString() 
    {
        return "Job Name : "+ task +"\nPriority : "+ priority;
    }
}

