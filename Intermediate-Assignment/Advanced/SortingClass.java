//Create a Java program that generates a random sequence of numbers and sorts them using Bubble Sort, Selection Sort, Insertion Sort, and Quick Sort algorithms. Compare their performance for large data sets.
import java.util.Scanner;
public class SortingClass
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of the element in the array");
       int n=sc.nextInt();
       int array[]=new int[n];
       System.out.println("Enter the element");
       for(int i=0;i<n;i++)
       {
          array[i]=sc.nextInt();
          //array[i]=i;
       }
       Sort sort=new Sort();
       sort.insertionSort(array);
       sort.selectionSort(array);
       sort.bubbleSort(array);
       sort.quickSort(array);
    }
}
class Sort
{
     int len,i,j;
     long start,end,total;
     public void insertionSort(int a[])
     {
          len=a.length;  
          start=System.currentTimeMillis(); 
          for(int i=1;i<len;i++)
          {
              int k=a[i];
              j=i-1;
              while(j>=0 && k<a[j])
              {
                  a[j+1]=a[j];
                  j=j-1;
              }
              a[j+1]=k;
          }
          end=System.currentTimeMillis();
          display(a);
          total=end-start;
          System.out.println(" Insertionsort Total execution time :"+total);
     }
     public void selectionSort(int a[])
     {
          len=a.length;
          start=System.currentTimeMillis();
          for(int i=0;i<len;i++)
          {
              for(j=i+1;j<len;j++)
              {
                 if(a[i]>a[j])
                 {
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                 }
              }
          }
          end=System.currentTimeMillis();
          display(a);
          total=end-start;
          System.out.println(" Selectionsort Total execution time :"+total);
     }
     public void bubbleSort(int a[])
     {
         len=a.length;
         start=System.currentTimeMillis();
         for(i=0;i<len;i++)
         {
             for(j=0;j<len-i-1;j++)
             {
                if(a[j+1]<a[j])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
             }
        }
        end=System.currentTimeMillis();
        display(a);
        total=end-start;
        System.out.println(" Bubblesort Total execution time :"+total);
     }
     public void quickSort(int array[])
     {
        len=array.length;
        start=System.currentTimeMillis();
        sorting(array,0,len-1);
        end=System.currentTimeMillis();
        display(array);
        total=end-start;
        System.out.println(" Quicksort Total execution time :"+total);
     }
     public int partition(int arr[], int low, int high)
     {
		int pivot = arr[high]; 
		int i = (low-1);
		for (int j=low; j<high; j++)
		{
			if (arr[j] <= pivot)
			{
			    i++;
			    int temp = arr[i];
			    arr[i] = arr[j];
			    arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	void sorting(int arr[], int low, int high)
	{
		if (low < high)
		{
		    int pi = partition(arr, low, high);
		    sorting(arr, low, pi-1);
		    sorting(arr, pi+1, high);
		}
	}
	public void display(int array[])
	{
	    for(int value:array)
	    {
                System.out.print(value +" ");
            }
        }
}
