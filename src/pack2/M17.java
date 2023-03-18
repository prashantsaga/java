package pack2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// serialization
class A implements Serializable
{
	int i;
	transient int j;
	static int k;
}
public class M17 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("s1.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		A a1 = new A();
		a1.i = 100;
		a1.j = 200;
		a1.k = 300;
		out.writeObject(a1);
		System.out.println("done");
	}
}
