package EY2408;

class parent {
	void show() {
		System.out.println("Parent class function = show");
	}

	int data = 10;
}

public class SuperKeyword extends parent {
	//@Override
	void show() {
		System.out.println("child class function = show");
	}
	int data = 20;
	
	void display() {
		System.out.println("The value of current class data is " + this.data);
		System.out.println("The value of parent class data is " + super.data);
		this.show();
		super.show();
	}
	
	public static void main(String[] args) {
		SuperKeyword obj = new SuperKeyword();
		obj.display();

		}

	}


