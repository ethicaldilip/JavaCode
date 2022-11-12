public class ConstructorDemo
{
	int a,b;
	ConstructorDemo(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void sum()
	{
		System.out.println("Addition is "+(a+b));
	}



	public static void main(String []Args)
	{
		//Test t=new Test(25,50);
		ConstructorDemo d=new ConstructorDemo(25,50);
		d.sum();
	}
}
