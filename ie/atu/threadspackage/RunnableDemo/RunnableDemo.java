package ie.atu.threadspackage.RunnableDemo;

class RunnableDemo implements Runnable {

	public void run() {

		// This is the code that will be executed by the thread. It will count down from 10 to 1.
		for (int i = 10; i > 0; i--) {
			// Print thread name and the value of i as it counts down from 10 to 1.
			System.out.println(Thread.currentThread().getName() + " countdown: " + i);
			/*
			 * Let the thread sleep for 1 millisecond between each countdown so that it
			 * does not finish executing before the other thread has a chance to start. We
			 * need to surround the sleep in a try/catch block because the sleep method can
			 * throw an InterruptedException.
			 */
			try {
				// Let thread sleep for 1 millisecond
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		} // end for loop
	} // end run method
} // End of class RunnableDemo
