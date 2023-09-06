package EY2808;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleAPIUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResourceBundle rs = ResourceBundle.getBundle("EY2808.TestBundle");
		displayValues(rs);
		
		Locale swedishLocale = new Locale("sv","SE");
		ResourceBundle rs2 = ResourceBundle.getBundle("EY2808.TestBundle",swedishLocale);

	}
	static void displayValues(ResourceBundle bundle) {
		System.out.println("Hello Message :" + bundle.getString("my.hello") );
		System.out.println("Hello Message : "+ bundle.getString("my.key"));
		System.out.println("Hello Message : "+ bundle.getString("my.question"));
	}

}
