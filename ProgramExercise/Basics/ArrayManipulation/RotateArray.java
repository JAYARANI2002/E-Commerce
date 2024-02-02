//Write a program to rotate the elements of an array by a given number of positions.
import java.util.Scanner;
class RotateArray
{    
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int [] arr = new int [n];
	        int i,j,last;	
	        for(i=0;i<n;i++)
		{
		     arr[i]=sc.nextInt();
                }
		System.out.println("Enter the no of rotations");
	        int k=sc.nextInt();	
                System.out.println("Original array: ");    
		for (i = 0; i < n; i++) 
		{     
                    System.out.print(arr[i] + " ");     
                }      
                for(i = 0; i < k; i++)
		{    
                        last = arr[n-1];    
			for(j = n-1; j > 0; j--)
			{     
                            arr[j] = arr[j-1];    
                        }    
                        arr[0] = last;
		}	    
        
        
        System.out.println("Array after right rotation: ");    
        for(i = 0; i<n; i++){    
            System.out.print(arr[i] + " ");    
        }    
    }    
}    
