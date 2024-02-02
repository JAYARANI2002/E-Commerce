import java.util.Scanner;
public class MappingDigitToLetters
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number");
		int n=sc.nextInt();
		String ch[]={"","","a,b,c","d,e,f","g,h,i","j,k,l","m,n,o","p,q,r,s","t,u,v","w,x,y,z"};
		if(n>=2 && n<=9)
		{
	            System.out.print(ch[n]);
	        }
	        else if(n>=20 && n<=99)
	        {
	           int rem=n%10;
	           int quo=n/10;
	           if(quo!=1 && quo!=0 && rem!=1)
	           {
	                String digit[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};     
	                String first=digit[quo];
	                String second=digit[rem];
	                String result = "";
	                for (int i=0;i<first.length();i++)
	                {
	                    for (int j=0;j<second.length();j++)
	                    {
	                      result = ""+ first.charAt(i) + second.charAt(j);
	                      System.out.println(result);
	                    }
	                   } 
	                     
	                  
                      }
                 }
                  else
                 {
                        System.out.println("Enter valid number");
	          }

         }
}	                    
                       
	           
