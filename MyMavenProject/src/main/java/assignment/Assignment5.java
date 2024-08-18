// By using method leaned in class
/*Write a program to find the grade of 2 students based on total marks(3 subjects)
 1. Get the students marks by constructor
 2. Return total mark into main method.
 3. Find the grade of each student
*/
package assignment;

public class Assignment5 
{

	int m1,m2,m3,total;
	
	public Assignment5(int m1, int m2, int m3)
	{
	 this.m1=m1;
	 this.m2=m2;
	 this.m3=m3;	  
	}
	
	public int mark()
	{
		total= m1+m2+m3;
		return total;
	}
	
	public char grade()
	{
		int totalmark=mark();
		if(totalmark>=90) 
		{
			return 'A';
		}
		else if(totalmark>=70 && totalmark<90)
		{
			return 'B';
		}
		else if(totalmark>50 && totalmark<70)
		{
			return 'C';
		}
		else
		{
			return 'D';
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Assignment5 obj= new Assignment5(25,28,30);
		Assignment5 obj1= new Assignment5(40,31,28);
		System.out.println("Total marks of 1st student is "+obj.mark());
		System.out.println("The grade obtained by 1st student is "+obj.grade());
		System.out.println("Total marks of 2nd student is "+obj1.mark());
		System.out.println("The grade obtained by 2nd student is "+obj1.grade());
	}

}
