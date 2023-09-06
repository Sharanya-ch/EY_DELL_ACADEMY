package EY2108;


class SampleClass{}
interface MyInterface{}

public class ReflectionClassInJava throws ClassNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass obj = new SampleClass();
		ReflectionClassInJava rC= new ReflectionClassInJava();
		rC.printName(obj);
		
		//examining and modifying behaviour of the class
		Class c = boolean.class;
		System.out.println(c.getName());
		
		Class c2 = ReflectionClassInJava.class;
		System.out.println(c2.getName());
		
		//forName is used to load the class dynamically
		//returns the instance of the class
		Class c4 = Class.forName("EY2108.ReflectionClassInJava");
		System.out.println(c4.getName());

	}

}
