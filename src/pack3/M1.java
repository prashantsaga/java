package pack3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class M1 {
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fout = new FileOutputStream("s4.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		A a1 = new A();
		a1.i = 10;
		a1.j = 20;
		a1.k = 30;
		
		out.writeObject(a1);
		System.out.println("done");
	}

}
