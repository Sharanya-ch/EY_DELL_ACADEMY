package EY1408;

class Machine{
	void start()  {
		System.out.println("Machine has started ");
	}
	void stop()  {
		System.out.println("Machine has stopped");
	}
}


class Camera extends Machine{
	@Override //good practice
	void start()  {
		System.out.println("Camera has started ");
	}
	void snap()  {
		System.out.println("Photo clicked");
	}
}
public class D2P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
