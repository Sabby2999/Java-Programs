import java.util.*;
class ArrayDemo
{
	public static void main(String s[])
	{
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the elements in the array : ");
		for(int i=0;i<10;i++)
 			arr[i]=sc.nextInt();
		System.out.print("\n Displaying Array element : ");
		for(int i=0;i<10;i++)
 			System.out.print(" --> "+arr[i]);
	}
}