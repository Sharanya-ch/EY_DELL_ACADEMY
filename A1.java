package EY1408;

public class A1 {

	public static void main(String[] args) {
		
		int[] intArr = new int[6];
		
		intArr[0]= 10;
		intArr[3]= 80;
		intArr[4]= 100;
		intArr[2]= 190;
		intArr[1]= 150;
		min(intArr);
	
        String[] strArr = {"Z", "X", "g", "H","K"};
        
        
        for(int i=0; i<intArr.length ; i++) {
        	System.out.print(intArr[i] + " ");
        	
        }
        System.out.println();
        
        
        for(int i=0; i<strArr.length ; i++) {
        	System.out.print(strArr[i] + " ");
        }
        
        System.out.println();
       
        
        for(int i: intArr) {
        	System.out.print(i+ " ");
        }
        
	}
	
   static void min(int[] intArr) {
        	int min = intArr[0];
        	for(int i =0; i<intArr.length; i++) {
        		if(min > intArr[i]) {
        			min = intArr[i];
        		}
        	}
        }
        
      System.out.print("minimum value" +min);
        
	}

}
