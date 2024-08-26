package multilevel_inheritance;

public class Child extends Parent
{
	public void lastchild()
	{
		System.out.println("Yonger Generation");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child obj = new Child();
				obj.lastchild();
				obj.nextchild();
				obj.child();
	}

}
