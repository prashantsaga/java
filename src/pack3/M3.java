package pack3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class M3 {
  public static void main(String[] args) throws IOException 
  {
	B b1 = new B();
	b1.i = 10;
	b1.j = 30;
	b1.k = 50;
	
	FileOutputStream fout = new FileOutputStream("s5.ser");
	ObjectOutputStream out = new ObjectOutputStream(fout);
	b1.writeExternal(out);
	out.flush();
	System.out.println("done");
}
}
