import java.util.*;
class MatrixDemo
{
	public static void main(String s[])
	{
		int mat[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the no. of rows : ");
		int r=sc.nextInt();
		System.out.print("\n Enter the no. of columns : ");
		int c=sc.nextInt();
		System.out.print("\n Enter the elements in the array : ");
		for(int i=0;i<r;i++)
 			for(int j=0;j<c;j++)
				mat[i][j]=sc.nextInt();
		System.out.print("\n Displaying Matrix element : \n");
		for(int i=0;i<r;i++)
		{
 			for(int j=0;j<c;j++)
			{
				System.out.print("\t"+mat[i][j]);
			}
			System.out.println();
		}
	}
}