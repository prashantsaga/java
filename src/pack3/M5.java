package pack3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class C implements Serializable
{
	int i;
}
public class M5 {
	public static void main(String[] args) throws IOException, ClassCastException, ClassNotFoundException 
	{
       C c1 = new C();
       c1.i = 100;
       FileOutputStream fout = new   FileOutputStream ("s6.ser");
       ObjectOutputStream out = new   ObjectOutputStream(fout);
       out.writeObject(c1);
       
       FileInputStream fin = new   FileInputStream ("s6.ser");
       ObjectInputStream in = new   ObjectInputStream(fin);
       C c2 = (C) in.readObject();
       System.out.println(c2.i);
       
       System.out.println("-------");
       c2.i = 200;
       System.out.println(c1.i);
       System.out.println("----------");
       c1.i = 300;
       System.out.println(c2.i); // deepcopy(shallow copy) operation
	}
}
//original one through serialization process 
// original not depending one duplicate.
// duplicate can not depending on original
// object can be duplicate.
// 1.object class clone method is protected method.
// 2.clone method return type is object type.
// 3.clone method is throwing clone not supported exception
// protected member is inheritend to every sub class.
// clone method not call directly.
// as the return type object required downcasting.
// either try - catch or throws.



