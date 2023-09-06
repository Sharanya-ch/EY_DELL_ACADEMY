package EY1708;


class InvalidException extends Exception{
	InvalidException(String message){
		super(message);
	}
}
public class LetsCreateCustom {

	public static void main(String[] args) {
		
		try {
			validVoterStatus(17);
		}catch (InvalidException e) {
			System.out.println("Exception message is " + e.getMessage());
		}
		System.out.println("Code will run smoothly later");

	}
	
	static void validVoterStatus(int age) throws InvalidException{
		if(age<18) {
			throw new InvalidException("User cannot vote!");
		}
	}

}
