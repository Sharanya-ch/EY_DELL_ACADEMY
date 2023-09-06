package EY1708;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("String is a immutable class");
		Integer i = new Integer(2345);
		
		try {
			FileOutputStream fos = new FileoutputStream();
			ObjectOutputStream oos  = new ObjectOutputstream(fos);
			ObjectOutputStream oos2 = new objectOutputStream(new FileOutputStream("C:/files/ABC5.txt"));
			
			
			oos.writeObject(str);
			oos.writeObject(i);
			
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileOutputStream("C:/files/ABC2.txt"));
			System.out.println("String Data is " +(String) ois.readObject());
			System.out.println("Integer data is" + (Integer) ois.readObject());
			ois.close();
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			
			
		}

	}

}
