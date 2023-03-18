package pack3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M2 {
 public static void main(String[] args) throws IOException, ClassNotFoundException 
 {
	FileInputStream fin = new FileInputStream("s4.ser");
	ObjectInputStream in = new ObjectInputStream(fin);
	A a1 = (A)in.readObject();
	System.out.println(a1.i);
	System.out.println(a1.j);
	System.out.println(a1.k);
}
}
