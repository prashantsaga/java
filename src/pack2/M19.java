package pack2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class M19 {
	public static void main(String[] args) throws IOException 
	{
		B b1 = new B();
		b1.i = 10;

		FileOutputStream fout = new FileOutputStream("s2.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(b1);
		out.flush();
		out.close();
		fout.close();
		System.out.println("done");
	}
}
