package EY2308;


class Reentrant{
    public synchronized void m() {
        n();
        System.out.println("I am in m synchronized method");
    }
    public synchronized void  n() {
        System.out.println("I am in n synchronized method");
    }
}
public class ReentrantThreadClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        final Reentrant r = new Reentrant();
	        new Thread() {
	            public void run() {
	                r.m();
	            }
	        }.start();
	    }

	}
//copy pasted...class name differs anthe
}
