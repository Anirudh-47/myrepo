package constructor;

public class OVerriden {
	public void demo()
	{
		System.out.println("This is parent class");
	}
}
class Demo extends OVerriden{
	public void demo()
	{
		System.out.println("This is child class");
	}
}