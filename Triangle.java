import java.util.*;
class Triangle
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter the angles of a triangle \na = ");
		a=sc.nextInt();
		System.out.print("b = ");
		b=sc.nextInt();
		System.out.print("c = ");
		c=sc.nextInt();
		if((a+b+c)==180&&a!=0&&b!=0&&c!=0)
		{
			System.out.println("Is a TRIANGLE ");	
			if(a==b&&b==c)
				System.out.println("EQUILATERAL TRIANGLE ");
			else if(a==b||b==c||a==c)
				System.out.println("ISOSCELES TRIANGLE ");
			else
				System.out.println("SCALENE TRIANGLE ");	
		}
		else
			System.out.println("Is NOT a TRIANGLE ");
	}
}