package pack2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M22 {
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fin = new FileInputStream("s3.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		E e1 = (E) in.readObject();
		System.out.println(e1.a);
		System.out.println(e1.b);
		System.out.println(e1.c);
	}
}
