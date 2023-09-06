package EY1708;

import java.io.IOException;

public class ThrowKeyword {

	public static void main(String[] args) throws IOException {
		sampleMethod();
		System.out.println("Rest of the code works well ");
		

	}
	static void sampleMethod() {
		try {
			throw new IOException("Device Error");
		} catch(IOException e) {
			System.out.println("Exception Handled");
		}
	}

}
