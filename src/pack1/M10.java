package pack1;

import java.io.File;

public class M10 {
	public static void main(String[] args) {
		File f1 = new File("E:/aws/abc");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());// make directory
		System.out.println(f1.exists());
	}
}
