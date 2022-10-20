package ie.atu.threadspackage.RunnableDemo;

public class RunnableDemoDriver {
	public static void main(String args[]) {
		RunnableDemo runnableObject = new RunnableDemo();
		// Allocate two new thread objects and pass the runnable object to them and give them names.
		Thread thread1 = new Thread(runnableObject, "Thread 1");
		Thread thread2 = new Thread(runnableObject, "Thread 2");
		// Start the threads
		thread1.start();
		thread2.start();
	}

}