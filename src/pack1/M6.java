package pack1;

import java.io.File;
import java.io.IOException;

public class M6 {
	public static void main(String[] args)throws IOException {
		File f1 = new File("E:\\aws");
		File f2 = new File(f1, "Test.java");
		System.out.println(f2.exists());
		boolean b1 = f2.createNewFile();
		System.out.println(b1);
		System.out.println(f2.exists());
	}
}
