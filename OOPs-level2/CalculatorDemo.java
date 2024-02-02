//Write class Calculator with constructor ,method add(),sub(),div()and multi().Write class CalculatorDemo from their create instance of Calculator class and try to access its methods.
class Calculator
{
    int num1;
    int num2;
    int result;
    Calculator(int n1,int n2)
    {
        num1=n1;
        num2=n2;
        System.out.println("Number1="+num1+"  Number2= "+num2);
        this.add(n1,n2);
        this.sub(n1,n2);
        this.div(n1,n2);
        this.multi(n1,n2);
    }
    public void add(int num1,int num2)
    {
        result=num1+num2;
        System.out.println("Addition :"+result);
    }
    public void sub(int num1,int num2)
    {
        result=num1-num2;
        System.out.println("Subtraction :"+result);
    }
    public void multi(int num1,int num2)
    {
        result=num1*num2;
        System.out.println("Multiplication :"+result);
    }
    public void div(int num1,int num2) 
   {
        result=num1/num2;
        System.out.println("Division :"+result);
    }
}
public class CalculatorDemo
{
     public static void main(String args[])
     {
          Calculator calc=new Calculator(10,-2);
     }
}
    
