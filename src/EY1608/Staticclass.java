package EY1608;

public class Staticclass {
	int num1;
	static int num2;
	static {
		System.out.println(" Static Initializer ");
		num2 = 100;
	}
	Staticclass(){
		num1 = 78;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Main method");	
		System.out.println(" The value of number2 is  " + num2);		
		Staticclass s1 = new Staticclass();
		System.out.println(" The value of num1 is  " + s1.num1);
	}
}
