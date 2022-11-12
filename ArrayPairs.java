import java.util.*;
class ArrayPairs
{
	public static void main(String []p)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int m[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<m.length;i++)
		{
			m[i]=sc.nextInt();
		}
		System.out.println("Enter the no.");
		int num=sc.nextInt();
		System.out.println("the array created is "+Arrays.toString(m));
		System.out.println("Indices of the elements whose sume is "+num);
		for(int i=0;i<m.length;i++)
		{
			for(int j=1;j<m.length;j++)
			{
				if((m[i]+m[j])==num && i !=j)
				{
					System.out.println(i+" "+j);
				}
			}
		}
	}
}
		
		
		