//Create a program that generates a random number between 1 and 100 and asks the user to guess the number. Provide feedback to the user if their guess is too high or too low, and keep track of how many guesses it takes them to get the correct answer.

import java.util.Scanner;
import java.util.Random;
public class GuessNo
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                Random r=new Random();
                int randomnumber,c=0,guess;
                final int Max=100;
                randomnumber=r.nextInt(Max)+1;
                boolean f=false;
                while(!f)
                {
                        System.out.println("Guess the number from range 1 to 100");
                        guess=sc.nextInt();
                        if(guess==randomnumber)
                        {
                                c++;
                                f=true;
                                System.out.println("You Guess the number correctly in "+c+" attempt");
                        }
                        else
                        {
                                c++;
                                System.out.println(guess>randomnumber?"It is too high":"It is too low");
                        }
                }
        }
}

