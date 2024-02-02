import java.util.*;
import java.io.*;
public class CountFrequency
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      HashMap<String,Integer> map=new HashMap<>();
      System.out.println("Enter the String");
      String s=sc.nextLine();
      String words[]=s.split(" ");
      for(String word:words)
      {  
          if(map.containsKey(word))
          {
              map.put(word,map.get(word)+1);
          }
          else
          {
             map.put(word,1);
          }
      }
      System.out.println(map);
   }
}
       
