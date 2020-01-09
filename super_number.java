import java.util.*;
class super_number
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0,r,i=1;
		System.out.print("Enter the number : ");
		a=sc.nextInt();
		b=a;
		while(b!=0)
		{
			r=b%10;
			c=c*10+r;
			b/=10;
		}
		b=c;
		c=0;
		while(b!=0)
		{
			r=b%10;
			c=c+(int)Math.pow(r,i++);
			b/=10;
		}
		if(c==a)
			System.out.print("Is a Super number");
		else
			System.out.print("Is Not a Super Number");
	}
}