package EY1408;

public class v1 {
	 long startValue, endValue;
	 
	 v1(long startValue, long endValue){
		 if (startValue > endValue) {
			 throw new IllegalArgumentException("Start rime is greater than end time");
			
		 }
		 this.startValue= startValue;
		 this.endValue = endValue;
	 }
	 long v1() {
		 return endValue - startValue;
	 }

	public static void main(String[] args) {
		v1 obj = new v1(19, 27);
		System.out.println("Duration is " + obj.v1());

	}

}
