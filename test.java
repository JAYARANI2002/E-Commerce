// Interface A with an
// abstract method
interface A {
	void m();
}

// Interface B which doesn't
// implement the above interface
// and have the same abstract method
interface B {
	void m()
	{
		System.out.println("In B");
	}
}

// An Abstract class with the
// normal method M
class abstract C {
	public void m()
	{
		System.out.println("In C");
	}
}
public class test extends C
	implements A, B {

	public static void main(String args[])
	{
		// Creating an object of test
		test t = new test();

		// Here, a conflict occurs as to
		// which method needs to be called
		t.m();
	}
}

