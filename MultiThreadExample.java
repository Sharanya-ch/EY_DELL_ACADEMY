package EY2308;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class WorkerThread implements Runnable {
	private String message;
	public WorkerThread(String s) {
		this.message = s;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() + "start :" + message);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		System.out.println(Thread.currentThread().getName() + "end");
	}
}
public class MultiThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor1 = Executors.newFixedThreadPool(100);
		
		for (int i  =1; i<10; i++) {
			Runnable worker = new WorkerThread(" " +i);
			executor1.execute(worker);
			
		}
		System.out.println("Try to shutdown executors");
		executor1.shutdown();
		try {
			executor1.awaitTermination(5, TimeUnit.SECONDS);
		}catch(InterruptedException e) {
			System.err.println("Tasks interrupted");
		}finally {
			if(!executor1.isTerminated()) {
				System.out.println("cancel non-finished task");
			}
			executor1.shutdownNow();
			System.out.println("Shutdown ultimately finished");
		}

	}

}
