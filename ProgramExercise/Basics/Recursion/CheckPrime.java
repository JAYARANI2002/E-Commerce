//Write a program to check if a given number is a prime number using recursion.
import java.util.Scanner;
public class CheckPrime
{
	static boolean isPrime(int n, int i)
        {
		if (n <= 2) 
                      return (n == 2) ? true : false; 
                if (n % i == 0) 
                      return false; 
                if (i * i > n)
                      return true;
                return isPrime(n, i + 1);
        }
      	public static void main(String[] args)
	{  
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		if (isPrime(n, 2))
                    System.out.println("Yes it's a Prime");
                else
                    System.out.println("Not a Prime");
        }
 }
