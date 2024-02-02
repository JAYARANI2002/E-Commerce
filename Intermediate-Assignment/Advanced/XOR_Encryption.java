//Write a Java program that reads a file using FileInputStream and encrypts its content using XOR encryption. Save the encrypted data to a new file using FileOutputStream. Implement a method that decrypts the encrypted data.
import java.util.*;
import java.io.*;
public class XOR_Encryption
{
    public static void main(String args[])throws IOException
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("File name to encrypt");
       String file=sc.next();
       System.out.println("Enter the char to encrypt");
       char key=sc.next().charAt(0);
       System.out.println("Enter the encrypt-output file name");
       String enout=sc.next();
       encrypt(key,file,enout);
       System.out.println("Enter the decrypt-output file name");
       String deout=sc.next();
       decrypt(key,enout,deout);      
    }
    public static void encrypt(char key,String file,String output)throws IOException
    {
       FileInputStream fin=new FileInputStream(file);
       FileOutputStream fout=new FileOutputStream(output);
       int c;
       while((c=fin.read())!=-1)
       {
           fout.write(c^key);
       }
       fin.close();
   }
   public static void decrypt(char key,String file,String output)throws IOException
   {
       FileInputStream fin=new FileInputStream(file);
       FileOutputStream fout=new FileOutputStream(output);
       int c;
       while((c=fin.read())!=-1)
       {
           fout.write ((char)(c^key));
       }
       fin.close();
    }
            
 }
           
       
