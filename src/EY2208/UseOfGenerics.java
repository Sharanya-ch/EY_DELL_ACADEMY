package EY2208;

class MyGeneralizedClass<T>{
	 T obj;
	 //T stands for type e- element ,k -key ,v -value
	 
	 void add(T obj) {
		 this.obj = obj;
		 
	 }
	 
	 T get() {
		 return obj;
		 }
}
public class UseOfGenerics {

	public static void main(String[] args) {
		MyGeneralizedClass<Integer> intType = new MyGeneralizedClass<>();
		intType.add(21);
		intType.add(31);
		//intType.add("ABC");//compile time error will come if we try to add
		//any other data apart from integer
		System.out.println(intType.get());
	}

}
