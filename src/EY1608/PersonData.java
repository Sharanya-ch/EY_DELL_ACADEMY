package EY1608;

public class PersonData implements Cloneable {
	
	int person_id;
	String person_name ;
	
	PersonData(int person_id , String person_name){
		this.person_id = person_id ;
		this.person_name = person_name;
		
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		PersonData obj1 = new PersonData(124, "BBB");
		PersonData obj2 = (PersonData) obj1.clone();
		
		System.out.println("ID is " + obj1.person_id + " Name is " + obj1.person_name);
		System.out.println("ID is " + obj2.person_id + " Name is " + obj2.person_name);


	}

}
