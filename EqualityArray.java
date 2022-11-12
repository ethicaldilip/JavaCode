import java.util.*;
class EqualityArray
{
	public static void main(String []Args)
	{
		int a[]={10,15,20,30,40};
		int b[]={20,45,50,65,321};
		boolean res=Arrays.equals(a,b);
		if(res==true)
			System.out.println("Two arrays are equal");
		else
			System.out.println("Two arrays are not equal");
	}
}