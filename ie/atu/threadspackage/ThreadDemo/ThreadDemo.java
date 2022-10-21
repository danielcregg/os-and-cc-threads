package ie.atu.threadspackage.ThreadDemo;

class ThreadDemo extends Thread {

	public void run() {
		// Print the Name, Priority, State amd Alive status of the thread.
		System.out.println("Name: " + Thread.currentThread().getName() + 
		", Priority: " + Thread.currentThread().getPriority() +
		", State: " + Thread.currentThread().getState() +
		", Alive: " + Thread.currentThread().isAlive());

		for (int i = 10; i > 0; i--) {
			System.out.println(this.getName()+ ": " + i);
			try {
				Thread.sleep(10); // Let thread sleep for 10 millisecond
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		System.out.println(this.getName() +" is exiting");

	} // End run method
} // End of ThreadDemo class
