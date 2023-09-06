package EY2908;

import java.util.ArrayList;
import java.util.List;

class Student{
	private String stu_name;
	private int st_id;
	
	public int getSt_id() {
		return st_id;
	}

	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}

	Student(String stu_name, int st_id){
		this.stu_name = stu_name;
		this.st_id = st_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
}

interface StudentDAO{
	public List<Student> getAllStudents();
	public Student getStudent(int stu_id);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
class StudentDAOImp1  implements StudentDAO{
    List<Student> student;
        public StudentDAOImp1() {
        ArrayList students = new ArrayList<>() ;
            Student stu1 = new Student("ABC",123);
            Student stu2 = new Student("XYZ",456);
            students.add(stu1);
            students.add(stu2);
            }
    @Override
    public void updateStudent(Student student) {
	       students.remove(student.getSt_id().setStu_name(student.getStu_name()));
	       System.out.println("Student with id " + student.getSt_id() + "is updated");
           }
   @Override
   public void deleteStudent(Student student) {
	   students.remove(student.getSt_id());
	   System.out.println("Student with id " + student.getSt_id() + "is removed");
   }
public class DAO_DesignPattern {
	
    public static void main(String[] args) {
    	StudentDAO studentDao =new StudentDAOImp1();
    	for(Student st: studentDao.getAllStudents()) {
    		System.out.println("Student [ Stu id" + st.getSt_id() + "Name: " + st.getStu_name());
    	}
    	Student firstStudent = studentDao.getAllStudents().get(0);
        System.out.println("First student is " + firstStudent.getSt_id() + " "+ firstStudent.getStu_name() + " ]");
        firstStudent.setStu_name("PQR");
        for(Student st:studentDao.getAllStudents()) {
        	System.out.println("Student [ Stu id " + st.getSt_id() + " , Name " + st.getStu_name() + "]");
        }
        //studentDao.updateStudent(firstStudent);
  
    }
  }
@Override
public List<Student> getAllStudents() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Student getStudent(int stu_id) {
	// TODO Auto-generated method stub
	return null;
}
}