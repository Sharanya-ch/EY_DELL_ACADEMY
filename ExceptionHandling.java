package EY1708;
import java.sql.SQLException;

class Parent {

	void show() {
		System.out.println("Parent class method");
	}

}

public class ExceptionHandling extends Parent {

	@Override
	void show() throws Exception {
		System.out.println("Child Class Exception");
	}

	public static void main(String[] args) {

	}

}