class InitializeConstructor1
{
	InitializeConstructor1(int a, int b)
	{	
		int c=a+b;
		System.out.println("sum is "+c);
	}
}
class InitializeConstructor extends InitializeConstructor1
{
	InitializeConstructor(int x)
	{
		super(12,65);
		System.out.println("x is "+x);
	}
	public static void main(String []Args)
	{
		InitializeConstructor ic=new InitializeConstructor(25);
	}
}
	