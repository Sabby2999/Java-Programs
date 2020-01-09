import java.util.*;
class Reverse2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[20];
		int temp;
		System.out.print("\n Enter the no. of elements : ");
		int n=sc.nextInt();	
		System.out.print("\n Enter the elements in the array : ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0,j=n-1;i<n/2;i++,j--)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int i=0;i<n;i++)
		{
			int x=arr[i],r,s=0;
			for(;x>0;)
			{
				r=x%10;
				s=s*10+r;
				x/=10;
			}
			arr[i]=s;
		}
		System.out.print("\n Displaying Reverse Array : ");			
		for(int i=0;i<n;i++)
			System.out.print(" --> "+arr[i]);
		
	}
}