package ie.atu.threadspackage.RunnableDemo;

class RunnableDemo implements Runnable {

	public void run() {
		// When a thread is created, it is given a name and a priority.
		System.out.println(Thread.currentThread().getName() +" is running with priority " + Thread.currentThread().getPriority());
		
		// This is the code that will be executed by the thread
		for (int i = 10; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " countdown: " + i);
			try {
				Thread.sleep(10); // Let thread sleep for 10 millisecond
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		System.out.println("Thread exiting");
	}

}
