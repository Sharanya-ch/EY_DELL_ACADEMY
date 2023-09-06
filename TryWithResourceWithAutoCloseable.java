package EY1708;

public class TryWithResourceWithAutoCloseable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			tryWithResource();	
		} catch(Exception e) {
			System.out.println(" Exception thrown is " + e.getMessage());
		}
		

	}
	static void tryWithResource() {
		try(MyResource mr = new MyResource()) {
			System.out.println(" I am in try with resource method");
			if(true) {
				throw new Exception("Exception thrown from Try with resource");
			}
		}
		
		//this is using try without resource like try and catch
				try{
					tryWithoutResource();
					}
				catch (Exception e){
					System.out.println(" Exception thrown is " + e.getMessage());
				}			
				
    static void tryWithoutResource() throws Exception{
		MyResource  mr = null;
		try {
			mr = new Myresource();
			System.out.println("I am in try without resource method");
			if(true) {
				throw new Exception("Exception thrown from Try without resource");
			} finally {
				if(mr!=null) {
					mr.close();
					}
				}
			
		
			}
		}
	}
	
	static class MyResource implements AutoCloseable {
		@Override
		public void close() throws Exception {
			System.out.println("CLose will be called automatically " + "for all cleanup activity");
		}
	}

}
