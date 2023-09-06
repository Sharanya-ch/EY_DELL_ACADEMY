package EY2508;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		 display();
	}
	static void display() {
		int  n = 8;
		for(int i =0; i<n;i++) {
			System.out.println("Hello world !!\n");} //O(n)
			
	    for(int i =1; i<n;i=i*2) {
		    System.out.println("Hello world !!\n");} //O(log2(n))
		    
		for(int i =2; i<n;i= (int)Math.pow(i, 2)) {
		    System.out.println("Hello world !!\n"); //O(log(log(n)))

			
		}
	}}


