package ie.atu.threadspackage.ThreadDemo;

public class ThreadDemoDriver {
	public static void main(String args[]) {
		// Variables to store thread states
		String thread1State = "unknown";
		String thread2State = "unknown";
		// Create two new threads
		Thread thread1 = new ThreadDemo();
		Thread thread2 = new ThreadDemo();
		// Name the threads
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		// Set the priority of the threads
		thread1.setPriority(Thread.MIN_PRIORITY); // Thread.Min_Priority = 1
		thread2.setPriority(Thread.MAX_PRIORITY); // Thread.Max_Prioroty = 10
		// Start the threads
		thread1.start();
		thread2.start();
	
		// While the threads are alive monitor for changes in their state and print them out.
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
} // End class
