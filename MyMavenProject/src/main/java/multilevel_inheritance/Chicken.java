package multilevel_inheritance;

public class Chicken extends Hen 
{
	public void result()
	{
		System.out.println("The small hens are called chickens");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Chicken obj = new Chicken();
				obj.result();
				obj.display();
				obj.show();
	}
}
