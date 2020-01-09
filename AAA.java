import java.util.*;
class AAA
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0,r;
		System.out.print("\nREVERSE OF A NUMBER\n");
		System.out.print("Enter the number : ");
		a=sc.nextInt();
		b=a;
		while(b!=0)
		{
			r=b%10;
			c=c*10+r;
			b/=10;
		}
		System.out.print(a+" reverse is "+c);
		System.out.print("\n\nARMSTRONG NUMBER\n");
		System.out.print("Enter the number : ");
		a=sc.nextInt();
		b=a;
		c=0;
		while(b!=0)
		{
			r=b%10;
			c=c+(int)Math.pow(r,3);
			b/=10;
		}
		if(c==a)
			System.out.print("Is a Armstrong number");
		else
			System.out.print("Is Not a Armstrong Number");
		System.out.print("\n\nSUM OF DIGIT OF A NUMBER\n");
		System.out.print("Enter the number : ");
		a=sc.nextInt();
		b=a;
		c=0;
		for(;b!=0;)
		{
			r=b%10;
			c=c+r;
			b/=10; 
		}
		System.out.print("SUM is "+c);
	}
}