package EY2408;
interface TestInterface{
	public void square(int a);
	
	default void show() {
		System.out.print("implemented only for one class");
	}
}
public class DefaultKeywordFunctinality  implements TestInterface{
	
	@Override
	public void square(int a) {
		System.out.println(a*a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultKeywordFunctinality obj = new DefaultKeywordFunctinality();
		obj.square(4);
		obj.show();

	}

}
