class SmallAndLargestElement
{
	public static void main(String []Args)
	{
		int a[]={2,3,56,5,4,6};
		int large=a[0],small=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>large)
				large =a[i];
			if(a[i]<small)
				small=a[i];
		}
		System.out.println("large and small no. respecitvely is "+large+" And "+small);
	}
}