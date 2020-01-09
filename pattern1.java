import java.util.*;
class pattern1
{
	public static void main(String s[])
	{
		int num,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the number of rows : ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}