class A1{
void print()
{
System.out.println("Hello");
}
}

interface printable implements A{
void print();
public static void main(String args[]){
A obj = new A();
obj.print();
 }
}

