import java.util.*;
class ReverseArray
{
	public static void main(String []Args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the elements of an array");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Reverse order of array is: ");
		//int n=a.length;
		for(int j=size-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
	}
}