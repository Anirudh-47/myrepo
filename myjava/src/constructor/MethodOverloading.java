package constructor;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOver m = new MethodOver();
		m.hello();
		m.hello(10);
		m.hello(30, 40);
	}

}
