package pack1;

import java.io.File;

public class M11 {
	public static void main(String[] args) {
		File f1 = new File("E:/aws/abc");
		System.out.println(f1.isFile());//is file method check file type
		System.out.println(f1.isDirectory());
		File f2 = new File("test.txt");
		System.out.println(f2.isFile());
		System.out.println(f2.isDirectory());
	}
}
