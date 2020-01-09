import java.util.*;
class calcii
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		String str;
		System.out.print("MENU\n~~~~\nAdd\nSubtract\nMultiple\nDivide\nRemainder\n");
		System.out.print("Enter your choice : ");
		str=sc.nextLine();
		System.out.println("Enter valuse a = ");
		a=sc.nextInt();
		System.out.println("b = ");
		b=sc.nextInt();
		switch(str)
		{
			case "Add":System.out.println("Sum is "+(a+b));
				break;
			case "Subtract":System.out.println("Difference is "+(a-b));
				break;
			case "Multiple":System.out.println("Multiplication is "+(a*b));
				break;
			case "Divide":System.out.println("Division is "+(a/b));
				break;
			case "Remainder":System.out.println("Remainder is "+(a%b));
				break;
			default:System.out.println("Wrong Choice");		
		}
	}
}