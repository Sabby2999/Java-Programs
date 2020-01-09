import java.util.*;
class leap_year 
{
	public static void main(String s[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the year : ");
		a=sc.nextInt(); 
		if((a%4==0&&a%100!=0)||(a%400==0))
			System.out.print(a+" is a leap year");
		else
			System.out.print(a+" is not a leap year");
	}
}