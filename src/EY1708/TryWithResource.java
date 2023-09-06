package EY1708;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Files/ABC.txt"));
			String str;
			while((str = br.readLine())! = null) {
				System.out.println(str);	
		}
			br.close();	
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		//try with resource
		try(BufferedReader br = new BufferedReader(new FileReader("C:/Files/ABC.txt"))) {
			String str;
			while ((str = br.readLine()  != null )) {
				System.out.println(str);
			}
			br.close();
		}

	}

}
