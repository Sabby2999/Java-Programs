import java.util.*;
class pattern2
{
	public static void main(String s[])
	{
		int num,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the number : ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}