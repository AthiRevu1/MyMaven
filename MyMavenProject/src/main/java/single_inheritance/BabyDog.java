package single_inheritance;

public class BabyDog extends Dog
{

	public void sleep()// instance method
	{
		System.out.println("Sleeping");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BabyDog obj= new BabyDog();
		obj.sleep();
		obj.bark();// for calling next class use "extends" parent class... after child class

	}

}
