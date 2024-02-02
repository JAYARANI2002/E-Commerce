public class Abstract
{
	abstract int add();
	class B extends Abstract
	{
		public final int add(int a,int b)
		{
			return a+b;
		}
	}
	public static void main(String args[])
	{
		Abstract obj=new B();
		System.out.println(add(2,4));
	}
}

