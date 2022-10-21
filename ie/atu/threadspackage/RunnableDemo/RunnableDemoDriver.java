package ie.atu.threadspackage.RunnableDemo;

public class RunnableDemoDriver {
	public static void main(String args[]) {

		// Variables to store thread states
		String thread1State = "unknown";
		String thread2State = "unknown";

		RunnableDemo runnableObject = new RunnableDemo();
		// Allocate two new threads. Pass them the runnable object and pass them a name.
		Thread thread1 = new Thread(runnableObject, "Thread 1");
		Thread thread2 = new Thread(runnableObject, "Thread 2");

		// Start the threads
		thread1.start();
		thread2.start();

		// Monitor for changes in thread state and print them out.
		while (thread1.isAlive() || thread2.isAlive()) {
			// If the state of Thread 1 is NOT equal to the currently stored state
			if (!thread1State.equals(thread1.getState().toString())) {
				// Update the stored state
				thread1State = thread1.getState().toString();
				// Print the new state of Thread 1 to the console
				System.out.println(thread1.getName() + " state: " + thread1State);
			}
			// If the state of Thread 2 is NOT equal to the currently stored state
			if (!thread2State.equals(thread2.getState().toString())) {
				// Update the stored state
				thread2State = thread2.getState().toString();
				// Print the new state of Thread 2 to the console
				System.out.println(thread2.getName() + " state: " + thread2State);
			}
		} // end while loop

	} // End of main method
} // End of class RunnableDemoDriver