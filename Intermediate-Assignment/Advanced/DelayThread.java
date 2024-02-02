//Implement a thread in Java that prints the numbers from 1 to 10 with a delay of 1 second between each number. Use the sleep() method to achieve the delay.

import java.io.*;
import java.lang.Thread;
 
class DelayThread {
    public static void main(String[] args)throws Exception
    {
            for (int i = 0; i < 5; i++) {
               
                // it will sleep the main thread for 1 sec
                // ,each time the for loop runs
                Thread.sleep(1000);
               
                // printing the value of the variable
                System.out.println(i);
            }
    }
}
