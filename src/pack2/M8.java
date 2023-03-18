package pack2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class M8 {
	public static void main(String[] args) throws IOException {
		FileWriter fout = new FileWriter("b1.txt");// raw functionality connect the file andwrite
		BufferedWriter bout = new BufferedWriter(fout);
		bout.write("abc");
		bout.write("abc1");
		bout.write("abc2");
		bout.newLine();
		bout.write("abc");
		bout.write("abc1");
		bout.write("abc2");
		bout.newLine();
		bout.write("hello");
		bout.write("test");
		bout.write("abc4");
		bout.flush();
		bout.close();
		bout.close();
		System.out.println("done");
	}

}
/* Limitation of file reader and writer
------------------------------------------
line by line reading and writing is not available.
buffer is not using while writing or reading without buffer reading and get less performance.
*/