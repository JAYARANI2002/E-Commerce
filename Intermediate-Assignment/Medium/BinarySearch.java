//Implement a binary search algorithm in Java to search for an element in an array.

public class BinarySearch
{
  public static void main(String args[])
  {
     int array[]=new int[]{1,2,3,4,5,6};
     int first=0,index=-1;
     int search=5;
     int last=array.length-1;
     while(first<last)
     {
        int middle=(first+last)/2;
        if(array[middle]==search)
        {
            index= middle;
        }
        if(array[middle]>search)
        {
            last=middle-1;
        }
        else
        {
           first=middle+1;
        }
     }
     System.out.println(index);
   }
}
