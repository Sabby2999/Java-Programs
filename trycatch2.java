class trycatch2
{
	public static void main(String s[])
	{
		try
		{
			int arr[]=new int[5];
			
			arr[5]=30;
			int b=10/0;
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println(f);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}