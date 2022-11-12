class Test
{
	Test()
	{
		this(2,5);
		System.out.println("Default Constructor Called");
	}
	Test(int x,int y)
	{
		System.out.println("Parameterized Constructor called");
	}
}
class Test1 extends Test
{
	Test1()
	{
		this("Ram","Shyam");
		System.out.println("Derives calss Default constructor");
	}
	Test1(String s1,String s2)
	{
		super();
		System.out.println("Derived class Parameterized Constructor");
	}
}
public class ConstructorChaining
{
	public static void main(String []Args)
	{
		Test1 t=new Test1();
	}
}