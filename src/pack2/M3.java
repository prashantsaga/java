package pack2;

import java.io.FileWriter;
import java.io.IOException;

public class M3 {
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("f3.txt",true);
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
// append boolean if true, then data will be written to the end of file