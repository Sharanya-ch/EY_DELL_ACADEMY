package EY2208;

@FunctionalInterface
interface Sample{
	String print(String name);
}
public class inlineImplementation {
	public static void main(String[] args) {
		Sample obj = (name) -> {return "Welcome" + name;};
		System.out.println(obj.print(" to lambda Expression Programming"));
	}

}
