import java.io.*;
class testthrow2
{
	static void method() throws ArithmeticException	
	{
		//throw new IOException("device error");
int b=10/0;
	}
	
	void method1()
{
System.out.println("rest of te code");
}

	public static void main(String s[]) throws IOException
	{
		
		method();
method1();
		System.out.println("rest of the code");

	}
}