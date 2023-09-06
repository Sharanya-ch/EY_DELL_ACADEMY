package EY1608;


abstract class Sample{
	abstract void show() ;
	
	
}
public class Anonymousinnerclass {
	
	public static void main(String[] args) {
		Sample obj = new Sample() {
		@Override
		void show() {
			System.out.println(" Hello Everybody! ");		
		}
	};
	obj.show();

  }
}
