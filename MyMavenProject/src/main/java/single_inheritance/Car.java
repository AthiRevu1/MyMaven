package single_inheritance;

public class Car extends Vehicle
{
	public void nextvehicle()
	{
	System.out.println("Car is a vehicle");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Car object= new Car();
		object.nextvehicle();
		object.next();
		
	}

}
