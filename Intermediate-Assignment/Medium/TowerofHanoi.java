//Tower of Hanoi 
import java.util.Scanner;
public class TowerofHanoi 
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of disk");
     int disks=sc.nextInt();
     tower(disks,'A','C','B');
   }
   public static void tower(int n,char from,char to,char sub)
   {
      if(n==1)
      {
          System.out.println("Take disk1 move from " +from+" to "+to);
          return;
      }
      tower(n-1,from,sub,to);
      System.out.println("Move disk "+n+" from "+ sub+" to "+to);
      tower(n-1,sub,to,from);
   }
      
 }

