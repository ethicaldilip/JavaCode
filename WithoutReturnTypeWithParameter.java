class TestDemo
{

	void area(float a, float b)
	{
		float ar;
		ar = a*b;
		System.out.println("Area is : "+ar);
	}
}
public class WithoutReturnTypeWithParameter
{
	public static void main(String []Args)
	{
		TestDemo t=new TestDemo();
		t.area(5,8);
	}
}
	