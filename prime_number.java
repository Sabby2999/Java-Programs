import java.util.*;
class prime_number
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0,r,i=1;
		System.out.print("Enter the number : ");
		a=sc.nextInt();
		for(i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				c++;
				break;
			}
		}
		if(c==0)
			System.out.print("Is a Prime number");
		else
			System.out.print("Is Not a Prime Number");
	}
}