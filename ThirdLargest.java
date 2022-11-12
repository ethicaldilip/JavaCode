class ThirdLargest
{
	public static void main(String []a)
	{
		int fl,sl,tl,i;
		int arr[]={24,54,31,16,82,45,67};
		fl=arr[0];
		sl=arr[0];
		tl=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>fl)
			{
				fl=arr[i];
			}
			if(arr[i]>sl && arr[i]<fl)
				sl=arr[i];
		}
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>tl && arr[i]<sl)
				tl=arr[i];
		}
		System.out.println(tl+" ("+fl+" and "+sl+" are the largest and second largest no.");
	}
}
				