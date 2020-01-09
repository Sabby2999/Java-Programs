import java.util.*;
class SumOfArray
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[20];
		System.out.print("\n Enter the no. of elements : ");
		int n=sc.nextInt();	
		System.out.print("\n Enter the elements in the array : ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=arr[i];
		System.out.print("Sum is "+ sum);			
	}
}