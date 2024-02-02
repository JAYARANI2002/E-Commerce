import java.io.*;
public class MainClass 
{
	public static void main(String[] args) throws IOException{
	File dpath=new File("/jrani");
	File f=File.createTempFile("Sam",".java",dpath);
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
		System.out.println(a+b);
		
	}
}

