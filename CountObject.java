class objectcount
{
	static int count;
	objectcount()
	{
		count++;
	}
}
public class CountObject
{
	public static void main(String []Args)
	{
		objectcount c1=new objectcount();
		objectcount c2=new objectcount();
		objectcount c3=new objectcount();
		objectcount c4=new objectcount();
		objectcount c5=new objectcount();
		objectcount c6=new objectcount();
		System.out.println("Object is: "+objectcount.count);
	}
}