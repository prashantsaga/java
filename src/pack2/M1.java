package pack2;

import java.io.FileWriter;
import java.io.IOException;

public class M1 {
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("f1.txt");
		out.write("abc");// all statement required try with a catch
		out.write("xyz");
		out.write("hello");// after writing it is not going to the nextline.it is remaing to the sameline
		out.write("test");
		out.flush();// flushing operation it is forcebly writing every character file system
		out.close();
		System.out.println("test");
	}

}
