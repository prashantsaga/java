package pack2;

import java.io.FileWriter;
import java.io.IOException;

public class M2 {
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("f2.txt");
		out.write("abc");
		out.write("xyz");
		out.write("\n");
		out.write("hello");
		out.write("test");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
