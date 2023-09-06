package EY1608;

public class SomeData {
	
	interface SampleData{
		void fullName(String firstname , String lastname);
		
	}
	
	
	public void fullName(String firstname , String lastname) {
		System.out.println("Name is " + firstname + " " + lastname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SomeData obj = new SomeData();
		obj.fullName("ABC", "XYyZ");

	}

}
