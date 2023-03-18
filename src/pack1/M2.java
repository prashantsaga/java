package pack1;

import java.io.File;
import java.io.IOException;

public class M2 {
	public static void main(String[] args)throws IOException {
		File f1 = new File("test.txt");
		System.out.println(f1.exists());
		boolean b1 = f1.createNewFile();
		System.out.println(b1);
		System.out.println(f1.exists());
	}
}
//