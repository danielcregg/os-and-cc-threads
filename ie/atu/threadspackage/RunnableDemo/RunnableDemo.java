package ie.atu.threadspackage.RunnableDemo;

class RunnableDemo implements Runnable {

	public void run() {
		// When a thread is created, it is given a name and a priority.
		System.out.println(Thread.currentThread().getName() +" is running with priority " + Thread.currentThread().getPriority());
		
		// This is the code that will be executed by the thread
		for (int i = 10; i > 0; i--) {
			// Print the output of the thread. Show its name and the value of i as it counts down.
			System.out.println(Thread.currentThread().getName() + " countdown: " + i);
			try {
				// Let the thread sleep for 10 milliseconds between each countdown so that it does not run too fast.
				Thread.sleep(10); 
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		System.out.println("Thread exiting");
	}

}
