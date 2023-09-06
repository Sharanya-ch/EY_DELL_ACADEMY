package EY1708;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int data = 10/0;
		//System.out.println(" value is  " + data);
		
		UncheckedException obj = new UncheckedException();
		obj = null;
		obj.abc();
		

	}
	
	void abc() {
		System.out.println("Hi" );
	}

}
