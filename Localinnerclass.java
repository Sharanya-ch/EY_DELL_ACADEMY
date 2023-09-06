package EY1608;

public class Localinnerclass {
	
	private int data= 10;
	
	
		void message() {
			class XYZ {
				void show() {
					System.out.println("The value of data is  " + data);
				}
		
		}
	    XYZ obj = new XYZ();
	    obj.show();
	    
	}

  public static void main(String[] args)  {
	  Localinnerclass obj2 = new Localinnerclass();
	  obj2.message();
  }
}
