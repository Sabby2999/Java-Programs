class trycatch1
{
	public static void main(String s[])
	{
		try
		{
			int arr[]={1,3,5,7};
			System.out.println(arr[10]); //may throw exception
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}