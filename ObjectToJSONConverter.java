package EY2108;

import java.lang.reflect.InvocationTargetException;

public class ObjectToJSONConverter {

	public static void main(String[] args) {
		try
		{
			CheckIfSerializable(obj);
			initializeObject(obj);
			return getJsonString(obj);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	private void CheckIfSerializable(Object obj) throws JsonSerializableException() {
		
	
	   if(Objects.isNull(obj)) {
		   throw new JsonSerializableException("Cant serialize null object");
		   
	   }
	Class<?> clazz = object.getClass();
	if(!clazz.isAnnotationPresent(JsonSerializable.class)) {
		
	}}
	
	private void initializeObject(Object object) throws IllegalAccessException, InvocationTargetException{
		throws IllegalAccessExce
	}
}
