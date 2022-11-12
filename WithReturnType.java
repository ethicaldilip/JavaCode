class TestDemo
{
	float area()
	{
		float ar,l=5,b=8;
		ar = l*b;
		return ar;
	}
}
public class WithReturnType
{
	public static void main(String []Args)
	{
		TestDemo t=new TestDemo();
		float res=t.area();
		System.out.println("Area is : "+res);
	}
}
	