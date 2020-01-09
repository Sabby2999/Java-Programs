class testthrow1
{
	static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("not valid ");
		else
 			System.out.println("Welcome to vote ");
	}
	public static void main(String s[])
	{
		validate(13);
		System.out.println("rest of the code");
	}
}