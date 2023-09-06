package EY2308;

public class DeadlockSituation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String resource1 = "A";
		final String resource2 = "B";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("Thread 1: locked resource");
					try {
						Thread.sleep(1000);	
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(resource2) {
						System.out.println("Thread 1: looking for resource 2");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("Thread 2: locked resource");
					try {
						Thread.sleep(1000);	
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(resource2) {
						System.out.println("Thread 2: looking for resource 1");
					}
				}
			}
		};
		t1.start();t2.start();

	}

}
