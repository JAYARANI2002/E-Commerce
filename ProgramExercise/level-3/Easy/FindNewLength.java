import java.util.Scanner;
public class FindNewLength
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the length Array1");
                int l=sc.nextInt();
                System.out.println("Enter the element Array1");
                int a[]=new int[l];
                int c=0;
                //int withoutDuplicate
                //int a[]=new int[l-1];
                for(int i=0;i<l;i++)
                {
                        a[i]=sc.nextInt();
                }
                System.out.println("Remove duplicate");
                for(int i=0;i<l;i++)
                {
                        int f=0;
                        for(int j=i+1;j<l;j++)
                        {
                                if(a[i]==a[j])
                                  //System.out.print(a[j]);
                                  f=1;

                        }
                        if(f==1)
                          continue;
                          c++;
                          System.out.println(a[i]);

                }/*
                //withoutDuplicate[k++]=a[l-1];
                for(int i:withoutDuplicate)
                {
                        System.out.println(i);
                }*/
                System.out.println("Updated Array Length"+c);


        }
}

