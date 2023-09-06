package EY1608;

public class Edata {

	int empId;
	String empName;

	static String orgAddress = "ABC XYZ";

	static void orgAddressChange() {
		orgAddress = "MNO PQR";
	}

	Edata(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	void display() {
		System.out.println("Name is  " + empName + " ID is  " + empId + " and organisation is " + orgAddress);
	}
	

	public static void main(String[] args) {

		Edata.orgAddressChange();
		Edata e1 = new Edata(111, "Gaali");
		Edata e2 = new Edata(1511, "Vaana");
		
		e1.display();
		e2.display();

	}
}
