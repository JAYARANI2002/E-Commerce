/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] a={1,3,5,7};
		int[] b={1,2,4,6,7,8,10};
		
		int i=0,j=0,k=0;
		
	//	System.out.println(max);
		int[] r=new int[a.length+b.length];
		boolean flag = true;
	    while(i<a.length || j<b.length)
	    {
	       if(i<a.length && flag==true)
	       {
	          r[k++]=a[i];
	           i++;
	          if(j<b.length)
	          {
	          flag=false;
	          }
	          else{
	              flag =true;
	          }
	       }
	       else if(i<b.length && flag==false)
	       {
            
	          r[k++] =b[j];
	          j++;
	          if(i<a.length)
	          {
	          flag =true;
	          }
	          else {
	              flag =false;
	          }
	       }
	      
	    }
	    
	    Arrays.sort(r);
		for(int k1:r)
		{
		    System.out.print(k1 + " ");
		} 
	}
}

