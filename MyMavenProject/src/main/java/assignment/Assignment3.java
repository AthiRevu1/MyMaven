/*Write a program to find the grade of 2 students based on total marks(3 subjects)
 1. Get the students marks by constructor
 2. Return total mark into main method.
 3. Find the grade of each student
*/
package assignment;

public class Assignment3 
{
	int s1m1,s1m2,s1m3, s2m1,s2m2,s2m3, total1, total2;
	public Assignment3(int s1m1,int s1m2,int s1m3, int s2m1, int s2m2, int s2m3)
	{
		this.s1m1=s1m1;
		this.s1m2=s1m2;
		this.s1m3=s1m3;
		this.s2m1=s2m1;
		this.s2m2=s2m2;
		this.s2m3=s2m3;
		total1= s1m1+s1m2+s1m3;
		total2= s2m1+s2m2+s2m3;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Assignment3 obj= new Assignment3(25,28,30,40,31,28);
		System.out.println("The total marks of 1st student is "+obj.total1);
		
		if(obj.total1>=90) 
		{
			System.out.print("The grade of 1st student is ");
			System.out.println("A grade");
		}
		else if(obj.total1>=70 && obj.total1<90)
		{
			System.out.print("The grade of 1st student is ");
			System.out.println("B grade");
		}
		else if(obj.total1>50 && obj.total1<70)
		{
			System.out.print("The grade of 1st student is ");
			System.out.println("C grade");
		}
		else
		{
			System.out.print("The grade of 1st student is ");
			System.out.println("D grade");
		}
		System.out.println("The total marks of 2nd student is "+obj.total2);
		if(obj.total2>=90) 
		{
			System.out.print("The grade of 2nd student is ");
			System.out.println("A grade");
		}
		else if(obj.total2>=70 && obj.total1<90)
		{
			System.out.print("The grade of 2nd student is ");
			System.out.println("B grade");
		}
		else if(obj.total2>50 && obj.total1<70)
		{
			System.out.print("The grade of 2nd student is ");
			System.out.println("C grade");
		}
		else
		{
			System.out.print("The grade of 2nd student is ");
			System.out.println("D grade");
		}
	}

}
