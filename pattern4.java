import java.util.*;
class pattern4
{
	public static void main(String s[])
	{
		int num,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the number : ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			for(k=i;k<num;k++)
				System.out.print(" ");
			for(j=1;j<2*i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}