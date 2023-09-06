package EY2108;

import java.util.Comparator;

class Employee1 implements Comparable<Employee1>{
	private int empId;
	private String empName;
	private int empAge;
	private int empSalary;

	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	
}
	Employee1(int empId, String empName, int empAge, int empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary= empSalary;
		
	}
	@Override
	public String toString() {
		return "id is" + this.empId + " and name is " + this.empName +" age is " + this .empAge + "Salary is "+ this.empSalary;
	}
	
	

   @Override
   public int compareTo(Employee1 o) {
	   return this.empId - o.empId;
   }
   
       
   public static Comparator<Employee1> ageComparator = new Comparator<>() {
	   @Override
	   public int compare(Employee1 o1, Employee1 o2) {
		   return o1.getEmpAge().compareTo(o2.getEmpAge());
	   };
   public static Comparator<Employee1> nameComparator = new Comparator<>() {
		   @Override
		   public int compare(Employee1 o1, Employee1 o2) {
			   return o1.getEmpName().compareTo(o2.getEmpName());
		   };
   public static Comparator<Employee1> salaryComparator = new Comparator<>() {
			   @Override
			   public int compare(Employee1 o1, Employee1 o2) {
				   return o1.getSalary().compareTo(o2.getEmpSalary());
			   }
	   };

   }
public class SortingTheObjects {

	public static void main(String[] args) {
		
	
		Employee1[] empArr = new Employee1[4];
		empArr[0] = new Employee1(123,"A ",25,30000);
		empArr[1] = new Employee1(333,"G ",27,31000);
		empArr[2] = new Employee1(193,"J ",25,38000);
		empArr[3] = new Employee1(173,"K ",22,33000);
		
		
		Arrays.sort(empArr);
		System.out.println(" Sorted emp array is " + Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee1.ageComparator);
		System.out.println(" Sorted emp array - age  is " + Arrays.toString(empArr));		
		
		Arrays.sort(empArr, Employee1.nameComparator);
		System.out.println(" Sorted emp array- name is " + Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee1.salaryComparator);
		System.out.println(" Sorted emp array-salary is " + Arrays.toString(empArr));
		
		

	}
	}


