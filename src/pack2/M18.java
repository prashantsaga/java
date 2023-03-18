package pack2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class M18 {
  public static void main(String[] args) 
		  throws IOException, ClassNotFoundException {
	FileInputStream fin = new FileInputStream("s1.ser");
	ObjectInputStream in = new ObjectInputStream(fin);
	A a1 = (A) in.readObject();
	System.out.println(a1.i);
	System.out.println(a1.j);
	System.out.println(a1.k);
}
}
