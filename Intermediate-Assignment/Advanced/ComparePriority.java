//Implement a PriorityQueue in Java that stores a set of tasks with priorities. Use a custom Comparator to define the order of tasks. Demonstrate the use of add(), remove(), and peek() methods.
import java.util.*;
public class ComparePriority
{
   
   
   public static void main(String args[])
   {
   Task[] tk=new Task[5];
   tk[0] = new Task("a",10);
   tk[1] = new Task("a",4);
   tk[2] = new Task("a",2);
   tk[3] = new Task("a",1);
   tk[4] = new Task("a",9);
   Arrays.sort(tk,new Priority());
      /*System.out.println("Enter the queue with size");
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      PriorityQueue<Task> queue=new PriorityQueue<>(n,new Priority());
      Task t;
      while(true)
      {
            System.out.println("\nPriority Queue Operations\n");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. check empty");
            System.out.println("4. clear");
            System.out.println("5. size");
            System.out.println("6. display");
            System.out.println("7. exit");
            Iterator<Task> iterate=queue.iterator();
            int choice = scan.nextInt();            
            switch (choice) 
            {
            case 1 : 
                System.out.println("Enter task name and priority");
                t=new Task(scan.next(), scan.nextInt() );
                queue.add(t);                     
                break;                          
            case 2 : 
                 queue.remove(); 
                 System.out.println("Task removes");
                 while(iterate.hasNext())
                 {
                    System.out.print(iterate.next()+"\n");
                 }
                 break;        
            case 3 : 
                System.out.println("\nEmpty Status : "+ queue.isEmpty() );
                break; 
            case 4 : 
                System.out.println("\nPriority Queue Cleared");
                queue.clear();
                break;    
            case 5 : 
                System.out.println("\nSize = "+ queue.size() );
                break; 
            case 6 : 
                System.out.println("\nQueue ");
                 while(iterate.hasNext())
                 {
                    System.out.print(iterate.next());
                 }
                break;   
            case 7:
                System.exit(0);        
            default : 
                System.out.println("Wrong Entry \n ");
            }              
        }*/
   }
}
class Priority implements Comparator
{
   public int compare(Object o1,Object o2)
   {
      
       Task t1 = (Task) o1;
       Task t2 = (Task) o2;
       return t1.priority-t2.priority;
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
        return "Job Name : "+ task +"Priority : "+ priority;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task t = (Task) o;

        if (!task.equals(t.task)) return false;

        return true;
    }
}

