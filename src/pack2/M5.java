package pack2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class M5 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("f1.txt");
		FileReader fin = new FileReader(f1);
		char[] chars = new char[(int) f1.length()];// length given long time
		fin.read(chars); // every char empty array
		String s1 = new String(chars);
		System.out.println(s1);
	}

}
