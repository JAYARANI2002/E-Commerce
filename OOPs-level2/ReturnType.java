//Write method for below return type Returning a void from a method. Returning a String array from a method. Returning an int array from a method. Passing two integer in to method and print out method
import java.util.Arrays;

public class ReturnType
{
   public static void main(String args[])
   {
       int array[]=new int[]{1,2,3,4,5};
       String str[]=new String[]{"abc","efg","hij"};
       display();
       add(2,3);
       System.out.println(printStringArray(str));
       System.out.println(returnInt(array));
       System.out.println(Arrays.toString(str));
       System.out.println(Arrays.toString(array));
   }
   
   public static void display()
   {
      System.out.println("This is return void ");
   }
   public static String[] printStringArray(String[] str1)
   {
      /*int i;  
      for(i=0;i<str1.length;i++)
      {
         System.out.println(str1[i]);     [Ljava.lang.String;@4aa298b7     //
      }*/
      return str1;
   }
   public static int[] returnInt(int array1[])
   {
     /*int j;
      for(j=0;j<array1.length;j++)
      {
         System.out.println(array1[j]);[I@7d4991ad

      }*/
      return array1;
   }
   public static void add(int num1,int num2)
   {
      System.out.println(num1+" "+num2);
   }
}
       
