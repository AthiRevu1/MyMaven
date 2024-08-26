package classworkjava;

public class StringEqualsIgnoreCases 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="Java";
		String s2="Java";
		String s3="JAVA";
		String s4="phython";
		String s5="JaVa";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.equalsIgnoreCase(s5));
	}
}
