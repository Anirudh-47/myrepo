package Threads;

public class RunDemo {

	public static void main(String[] args) {
		Runnableinf rn = new Runnableinf();
		Thread t1 = new Thread(rn);
		t1.start();

	}

}
