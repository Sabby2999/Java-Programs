class Swap
{
public static void main(String s[])
{
int a=10,b=20;
System.out.println("Before Swapping\na = "+a+" and b = "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping\na = "+a+" and b = "+b);
}
}