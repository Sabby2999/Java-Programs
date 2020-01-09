import java.util.*;
class pattern3
{
	public static void main(String s[])
	{
		int num,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the number : ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=i;j<=num;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}