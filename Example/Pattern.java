public class Pattern
{
     public static void main(String args[])
     {
          String s="program";
          int middle=s.length()/2;
          char[] c=s.toCharArray();
          String pattern="";
          int i=c[0];
          while(i<=middle)
          {
               System.out.println("");
               i++;
          }
          System.out.println();
          while(middle<s.length())
          {
               pattern+=c[middle];
               System.out.println(pattern);
               middle++;
          }
          System.out.println();
    }
 }
       
        
