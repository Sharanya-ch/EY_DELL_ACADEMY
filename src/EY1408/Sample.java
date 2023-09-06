package EY1408;

public class Sample {
	
	int empId;
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	String empName;
	double empSalary;
    String empDesignation;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample emp = new Sample();
		//emp.setEmpId(222);
		//emp.setEmpDesignation("superviser");
		//emp.setEmpSalary(2000);
		
		System.out.println("Id of the employee is "+emp.getEmpId());
		System.out.println("Designation of the employee is "+emp.getEmpDesignation());
		System.out.println("salary of the employee is "+emp.getEmpSalary());
	

	}

}
