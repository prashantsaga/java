package pack3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M4 {
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{ 
		FileInputStream fin = new FileInputStream("s5.ser");
		ObjectInputStream in = new ObjectInputStream(fin);

		B b1 = new B();
		System.out.println("initial:" + b1.i + "," + b1.j + "," + b1.k);
		b1.readExternal(in);
		System.out.println("final:" + b1.i + "," + b1.j + "," + b1.k);

	}
}

// original object and deserialization both are dis-joint.