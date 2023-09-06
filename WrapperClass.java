package EY1708;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte grade = 2;
		short marks = 20;
		float price = 8.3f;
		double rate = 240.3D;
		boolean flag = false;
		char initial = 'A';
		
		//AutoBoxing
		Byte b = new Byte(grade);
		Short s = new Short(marks);
		System.out.println("Data type grade is " +grade);
		System.out.println("Object b is "+b);
		
		byte byteValue = b.byteValue();
		System.out.println(byteValue);
	}

}
