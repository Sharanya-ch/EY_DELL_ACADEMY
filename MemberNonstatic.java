package EY1608;

public class MemberNonstatic {
	
	
	private int data = 10;
	
	class ABC{
		void show() {
			System.out.println("The value is  " + data);
		}
	}
	
	public static void main (String[] args) {
		MemberNonstatic n1 = new MemberNonstatic();
		MemberNonstatic.ABC n2 = n1.new ABC();
		n2.show();
		
	}

}
