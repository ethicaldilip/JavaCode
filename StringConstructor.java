class StringConstructor
{
	String s;
	StringConstructor()
	{
		System.out.println("Constructor called");
		s="Hello India";
	}
	public static void main(String []Args)
	{
		StringConstructor sc=new StringConstructor();
		System.out.println(sc.s);
	}
}