package EY2108;

@JsonSerializable
public class Person1 {
	
	@JsonElement
	private String firstName;
	
	@JsonElement
	private String lastName;
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String address;
	
	public Person1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person1(String firstName, String lastName, String age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	 
	
	@init
	private void initNames() {
		this.firstName = this.firstName.substring(0,1).
				toUpperCase() + this.firstName.substring(1);
		this.lastName = this.lastName.substring(0,1).
				toUpperCase() + this.lastName.substring(1);	
		
	}
	public String getFirstName() {
		return;
	}
	

}
