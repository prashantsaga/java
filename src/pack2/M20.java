package pack2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class M20 {
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fin = new FileInputStream("s2.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		B b1 = (B)in.readObject();
		System.out.println(b1.i);
	}
}
