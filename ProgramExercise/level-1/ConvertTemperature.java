import java.util.Scanner;
class ConvertTemperature
{
	public static void main(String args[])
	{
           Scanner sc=new Scanner(System.in);
	   float temperature=sc.nextFloat();
	   float celsius;
	   //fahrenhit to celsius
	   celsius=((float)temperature-32)*5/9;
	   System.out.println(temperature + " degree Fahrenheit is equal to "+ celsius + " in celsius");
	}
}
