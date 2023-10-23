package ie.atu.threadspackage.RunnableDemo;

/* This program demonstrates how to create a thread by implementing the Runnable interface.
 * We crate two threads and pass them the same runnable object which is an instance of the
 * RunnableDemo class. We then start the threads and monitor their state. We also print out
 * the name of the thread, its priority, its state and whether or not it is alive. 
 */
public class RunnableDemoDriver {
	public static void main(String args[]) {

		// Create to string variables to store the state of each thread
		String thread1State = "unknown";
		String thread2State = "unknown";

		RunnableDemo runnableObject = new RunnableDemo();
		// Allocate two new threads. Pass them the runnable object and pass them a name.
		Thread thread1 = new Thread(runnableObject, "Thread 1");
		// When thread1 is created it is in the NEW state and its Alive status is false.
		printThreadInfo(thread1);
		Thread thread2 = new Thread(runnableObject, "Thread 2");
		// When thread2 is created it is in the NEW state and its Alive status is false.
		printThreadInfo(thread2);

		// Start the threads i.e. change state from NEW to RUNNABLE and 
		// Alive status to true
		thread1.start();
		printThreadInfo(thread1);
		thread2.start();
		printThreadInfo(thread2);

		// While thread1 OR thread2 is alive
		while (thread1.isAlive() || thread2.isAlive()) {
			// Check if the state of thread1 is NOT equal to the currently stored state
			if (!thread1State.equals(thread1.getState().toString())) {
				// If it is not then update the stored state
				thread1State = thread1.getState().toString();
				// Print the new state of thread1 to the console
				System.out.println("***" + thread1.getName() + " state: " + thread1State + "***");
			} // end if
				// Check if the state of thread2 is NOT equal to the currently stored state
			if (!thread2State.equals(thread2.getState().toString())) {
				// If it is not then update the stored state
				thread2State = thread2.getState().toString();
				// Print the new state of thread2 to the console
				System.out.println("***" + thread2.getName() + " state: " + thread2State + "***");
			} // end if
		} // end while loop
		
		// The while loop above will exit when both threads have finished executing.
		// After execution print the Name, Priority, State and Alive status of both threads.
		printThreadInfo(thread1);
		printThreadInfo(thread2);
	} // End of main method
	// Method to print the Name, Priority, State and Alive status of a given thread.
	static void printThreadInfo(Thread thread) {
		System.out.println("***Name: " + thread.getName() +
				", Priority: " + thread.getPriority() +
				", State: " + thread.getState() +
				", Alive: " + thread.isAlive() +
				"***");
	} // End of printThreadInfo method
} // End of class RunnableDemoDriver