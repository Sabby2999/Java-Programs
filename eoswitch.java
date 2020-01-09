import java.util.*;
class eoswitch
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.print("Enter the number : ");
		a=sc.nextInt();
		a%=2;
		switch(a)
		{
			case 0:System.out.println("EVEN");
				break;
			default:System.out.println("ODD");		
		}
	}
}