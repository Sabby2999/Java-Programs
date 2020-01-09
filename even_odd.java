import java.util.*;
class even_odd
{
	public static void main(String s[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the number : ");
		a=sc.nextInt(); 
		if(a%2==0)
			System.out.print(a+" is even");
		else
			System.out.print(a+" is odd");
	}
}