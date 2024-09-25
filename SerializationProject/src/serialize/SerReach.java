package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class SerReach implements Serializable {

	public static void main(String[] args)  throws Throwable {
		int x = 42;
	    methodCallReadobject(x);
	}

	public static void methodCallReadobject(int i) throws IOException {
		String s = null;
		FileInputStream fis = new FileInputStream(s); // s

		ObjectInputStream ois = new ObjectInputStream (fis);
	    if (i < 3) {
	        try {
				ois.readObject();
				ois.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }

	}

}
