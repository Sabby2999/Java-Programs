import java.util.regex.*;
class TestSplit
{
	public static void main(String s[])
	{
		String str = "word1, word2 word3@word4?word5.word6";
		String[] arrOfStr= str.split("[, ?.@]+");
		for(String a: arrOfStr)
			System.out.println(a);
		String test="abc.def.123";
		String[] output = test.split("\\.");
//alternate
//		String[] output= test.split(Pattern.quote("."));
		
		System.out.println(output[0]);System.out.println(output[1]);System.out.println(output[2]);
	}
}