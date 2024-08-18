/*
 Write a program to find the
 1. Average of 3 integer nos, 3 float nos(should have same method name)
 2. Area of figures(circle,rectangle,square)by using 3 methods (should have same method name)
 */
package assignment;

public class Assignment4 
{
	
	public static void average(int a,int b, int c) // to find average of 3 integer nos
	{
		int avg= (a+b+c)/3;
		System.out.println("The average is "+avg);
	}
	
	public static void average(float a,float b, float c)// to find average of 3 float nos
	{
		float avg= (a+b+c)/3;
		System.out.println("The average is "+avg);
	}
	
	public static void area(double radius) // area of circle
	{
	 double area= 3.14*radius*radius;
	 System.out.println("Area of circle is "+area);
	}
	
	public static void area(int length, int width) //area of rectangle
	{
	 int area= length*width;
	 System.out.println("Area of rectangle is "+area);
	}
	
	public static void area(int side)// area of square
	{
	 int area= side*side;
	 System.out.println("Area of square is "+area);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Assignment4.average(6,5,3);// to find average of 3 integer nos
		Assignment4.average(5.2f, 2.5f, 1.8f); // to find average of 3 float nos
		Assignment4.area(5);// area of circle
		Assignment4.area(2,3);//area of rectangle
		Assignment4.area(6);// area of square
		
	}

}
