package pack2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M6 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("f1.txt");
		FileReader fin = new FileReader(f1);
		char[] chars = new char[5];// length given long time
		fin.read(chars); 
		String s1 = new String(chars);
		System.out.println(s1);
	}

}
