package EY1408;

public class SC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		grading('A');
		grading('B');
		grading('C');
		grading('D');

	}
	
	static void grading(char grades) {
		int success;
		
		switch(grade) {
		case 'A' :
			success=-1;
			System.out.println("Excellent Grade");
			break;
		case 'B':
		case 'C':
			System.out.println("Good grade")
			break;
		default:
			success= -1;
			System.out.println("Unknown Grade")
		
		}
	passThecourse(success);
	}

	

static void passThecourse(int success) {
	switch(success) {
	case 1:
		System.out.println("Passed the course");
		break;
	case 0:
		System.out.println("Can you give the exam again?");
		break;
	case -1:
		System.out.println("Reschedule the exam date");
		break;
	}
}


