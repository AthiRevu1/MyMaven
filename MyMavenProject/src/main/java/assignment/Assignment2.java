//Write a program to check whether the candidate is eligible for voting (use static method and boolean return type)
package assignment;

public class Assignment2 
{
	int age;

	public static void age(int age)
	{
		
		if(age>=18)
		{
			System.out.println("The person is eligible for voting");
		}
		else
		{
			System.out.println("The person is not eligible for voting");
		}
	}
	public static void main(String args[]) 
	{
		// TODO Auto-generated method stub
		Assignment2.age(31);
		
		
		

	}

}
