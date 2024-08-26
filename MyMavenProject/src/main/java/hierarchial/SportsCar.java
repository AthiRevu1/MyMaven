package hierarchial;

public class SportsCar extends Vehicle
{

	public void shape()
	{
		System.out.println("small car");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		SportsCar obj= new SportsCar();
		obj.shape();
		Car object= new Car();
		object.old();
		object.small();
		
	}

}
