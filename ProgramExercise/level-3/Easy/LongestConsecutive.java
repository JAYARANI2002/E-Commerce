import java.util.Scanner;
public class LongestConsecutive
{
	public static void main(String args[])
	{
		int a[]={49,1,3,200,2,4,70,5};
                boolean[] array = {true,false,false,true,true,true,true};
    int ix = 0;
    boolean condition = true;
    int longest = 0;
    int cnt = 0;
    for (int i=0;i<array.length;i++){
       if (condition!=array[i]){
           if (cnt > longest) {
                ix = i-cnt;
                longest = cnt;
           }
           condition = array[i];
           cnt = 0;
       }
       cnt++;

     }
     if (cnt > longest) {
        ix = array.length-cnt;
     }
     System.out.println(ix);
 }
