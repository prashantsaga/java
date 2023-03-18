package pack1;

import java.io.File;

public class M13 {
	public static void main(String[] args) {
		File f1 = new File("a/b/c/d/e/f/g/abc/test/hello");
		f1.mkdirs();
		System.out.println("done");
	}

}
