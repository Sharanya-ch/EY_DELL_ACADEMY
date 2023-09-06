package EY1408;

public class C1 {
	int number;
	//no arg
	C1()
	{
		number = 100;
		
	}
	C1(int number){
		this.number = number;
	}


	public static void main(String[] args) {
		
		C1 obj = new C1();
		System.out.println("The value is " + obj.number);
		
		C1 obj2 = new C1();
		System.out.println("The value is " + obj2.number);
	}
	
	}
