package assignment;

public class Assignment5 {

	int m1,m2,m3,total1, total2;
	public Assignment5(int m1, int m2, int m3)
	{
	 this.m1=m1;
	 this.m2=m2;
	 this.m3=m3;
	  
	}
	public int mark()
	{
		total1= m1+m2+m3;
		total2= m1+m2+m3;
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Assignment5 obj= new Assignment5(25,28,30);
		Assignment5 obj1= new Assignment5(40,31,28);
		System.out.println("Total marks of 1st student is "+obj.mark());
		
		System.out.println("Total marks of 2nd student is "+obj1.mark());
	}

}
