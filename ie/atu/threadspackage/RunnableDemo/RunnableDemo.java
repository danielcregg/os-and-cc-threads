package ie.atu.threadspackage.RunnableDemo;

class RunnableDemo implements Runnable {

	public void run() {
		// Print the Name, Priority, State amd Alive status of the thread.
		System.out.println("Name: " + Thread.currentThread().getName() + 
						   ", Priority: " + Thread.currentThread().getPriority() +
						   ", State: " + Thread.currentThread().getState() +
						   ", Alive: " + Thread.currentThread().isAlive());

		// This is the code that will be executed by the thread
		for (int i = 10; i > 0; i--) {

			/*
			 * Print the output of the thread. Show the thread name and the value of i as it
			 * counts
			 * down from 10 to 1.
			 */
			System.out.println(Thread.currentThread().getName() + " countdown: " + i);
			/*
			 * Let the thread sleep for 1 millisecond between each countdown so that it
			 * does not finish executing before the other thread has a chance to start. We
			 * need to surround the sleep in a try/catch block because the sleep method can
			 * throw an InterruptedException.
			 */

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		} // end for loop

		System.out.println(Thread.currentThread().getName() + " exiting run method");

	} // end run method	
} // End of class RunnableDemo
