package polimorphism;

public class MethodOverLoading 
{
	int a, b;
	public void addition(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	public void addition(int a, float b)
	{
		float d = a+b;
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.addition(5,3);
		obj.addition(10,3.5f);
	
		
	}

}
