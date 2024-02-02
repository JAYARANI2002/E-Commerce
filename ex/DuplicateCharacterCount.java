import java.util.Scanner;
public class DuplicateCharacterCount
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String");
       String s=sc.next();
       char c[]=s.toCharArray();
       int i,j;
       for(i=0;i<c.length;i++)
       {
            char cr=c[i];
            boolean visit=false;
            for(j=0;j<i;j++)
            {   
               if(cr==c[j])
               {
                  visit=true;
                  break;

               }
            }
            if(!visit)
            {
              count=0;
              for(j=0;j<c.length;j++)
              {
                  if(cr==c[j])
                    count++;
              }
              System.out.print(cr+""+count);    
           }           
       } 
    }
 }
