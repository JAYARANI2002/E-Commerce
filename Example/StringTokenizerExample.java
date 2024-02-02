import java.util.*;
public class StringTokenizerExample
{
	public static void main(String[] args) {
	    //String s="jayarani";
	    StringTokenizer st=new StringTokenizer("jayarani,Zoho");
	        while (st.hasMoreTokens()) {  
                     System.out.println(st.nextToken(","));  
                     }
		
	}
}


/*
import java.util.*;  
  
public class Main {  
   public static void main(String[] args) {  
       StringTokenizer st = new StringTokenizer("my,name,is,khan");  
        
      // printing next token  
      System.out.println("Next token is : " + st.nextToken(","));  
   }      
} */


/*
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    String s="jayarani  Zoho";
	    String n = "a";
	    for (int i=0;i<s.length();i++){
	        String val = String.valueOf(s.charAt(i));
	        System.out.print(s.charAt(i));
	        if (n.equals(val)){
	            System.out.println();
	        }
	    }
	   
	}
}*/
