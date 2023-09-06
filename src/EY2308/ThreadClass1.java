package EY2308;

public class ThreadClass1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass1 t1 = new ThreadClass1();
		t1.start();
	}
	 
	public void run() {
		System.out.println("I am running automatically");
	}
}
