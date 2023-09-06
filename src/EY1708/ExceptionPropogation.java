package EY1708;

public class ExceptionPropogation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Main method ");
		try {
			ExceptionPropogation obj = new ExceptionPropogation();
			obj.a();
		}catch(InterruptedException e) {
			System.out.println("Method MAin " + e.getMessage());
			
		}
	}
	
	void a() throws InterruptedException{
		System.out.println("Method A");
		b();
	}
	void b() throws InterruptedException {
		System.out.println("Method B");
		c();
		throw new InterruptedException("Thread Error");
	}
	void c() {
		System.out.println("Method C");
	}

}
