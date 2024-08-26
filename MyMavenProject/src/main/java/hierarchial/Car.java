package hierarchial;

public class Car extends Vehicle
{
	public void small()
	{
		System.out.println("Red color");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Car obj= new Car();
		obj.small();
		Car object= new Car();
		object.old();
		
		
	}
}
