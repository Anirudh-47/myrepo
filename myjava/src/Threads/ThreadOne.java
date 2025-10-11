package Threads;

public class ThreadOne extends Thread{
	public void run()
	{
		System.out.println("The current thread is :" +Thread.currentThread());
		}
}
