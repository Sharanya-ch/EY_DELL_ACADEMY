package EY2108;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//FIRST step towards creating custom annotation is to declare
//using keyword @interface
//Next to add meta data - run tume viability - type means it can apply
//to classes
//This class has no method so will mark as marker  interface
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {
	

}
