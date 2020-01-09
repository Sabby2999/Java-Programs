import java.util.*;
class greater_from_three
{
	public static void main(String s[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the values a = ");
		a=sc.nextInt(); 
		System.out.print("b = ");
		b=sc.nextInt();
		System.out.print("c = ");
		c=sc.nextInt();
		if(a>b)
			if(a>c)
				System.out.print(a+" is greatest");
			else 		
				System.out.print(c+" is greatest");	
		else
			if(b>c)
				System.out.print(b+" is greatest");
			else 		
				System.out.print(c+" is greatest");
	}
}