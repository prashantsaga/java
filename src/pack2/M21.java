package pack2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class M21 {
	public static void main(String[] args) throws IOException
	{
		E e1 = new E();
		e1.a = 10;
		e1.b = 20;
		e1.c = 30;
		
		FileOutputStream fout = new FileOutputStream("s3.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(e1);
		
		out.flush();
		out.close();
		fout.flush();
		fout.close();
		System.out.println("done");
	}
}
