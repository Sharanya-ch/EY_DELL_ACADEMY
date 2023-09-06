package EY1608;

public class StaticKeyword {
	
	static int count;
	StaticKeyword(){
		count--;
		System.out.println("count is  " + count);
    

}


public static void main(String[] args) {
	
	StaticKeyword c1 = new StaticKeyword();
	StaticKeyword c2 = new StaticKeyword();
	StaticKeyword c3 = new StaticKeyword();
	
}

}