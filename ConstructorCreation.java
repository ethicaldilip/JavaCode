class ConstructorCreation
{
	int a,b,c;
	ConstructorCreation()
	{
		a=5;
		b=8;
	}
	void sum()
	{
		a=15;
		b=16;
		c=a+b;
	}
	public static void main(String []Args)
	{
		ConstructorCreation cc=new ConstructorCreation();
		System.out.println("a="+cc.a);
		System.out.println("a="+cc.b);
		cc.sum();
		System.out.println("New a="+cc.a);
		System.out.println("New a="+cc.b);
		System.out.println("C="+cc.c);
	}
}