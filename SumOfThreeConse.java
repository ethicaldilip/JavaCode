class SumOfThreeConse
{
	public static void main(String []Args)
	{
		int arr[]={5,14,35,89,140};
		int n,temp=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			++count;
			temp=temp+arr[i];
			if(count==3)
			{
				n=temp/3;
				count=0;
				i=i-2;
				temp=0;
				System.out.print(n);
			}
			System.out.print(",");
		}
	}
}