class MethodDemo
{
	void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("addition is: "+sum);
	}
	void subtraction(int a, int b)
	{
		int sub=a-b;
		System.out.println("Subtraction is"+sub);
	}
	void multiplication(int a, int b)
	{
		int mul=a*b;
		System.out.println("Multiplication is: "+mul);
	}
public static void main(String []Args)
	{
		MethodDemo m=new MethodDemo();
		m.add(2,3);
		m.subtraction(2,4);
		m.multiplication(3,6);
	}
}