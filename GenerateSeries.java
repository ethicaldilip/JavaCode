class GenerateSeries
{
	public static void main(String []arr)
	{int n=0;
		int a[]=new int[6];
		for(int i=1;i<=6;i++)
		{	
			if(i%2 !=0)
			{
				a[n]=i*i*i;
				//System.out.print(",");
			}
			if(i%2==0)
			{
				a[n]=i*i;
				//System.out.print(n+",");
			}
			n++;
		}
		int i=0;
		while(i<6)
		{
			System.out.print(a[i]);
		    i++;
			System.out.print(",");
		}
	}
}