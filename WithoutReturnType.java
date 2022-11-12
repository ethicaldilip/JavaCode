class TestDemo
{
	void area()
	{
		float ar,l=5,b=8;
		ar = l*b;
		System.out.println("Area is : "+ar);
	}
}
public class WithoutReturnType
{
	public static void main(String []Args)
	{
		TestDemo t=new TestDemo();
		t.area();
	}
}
	