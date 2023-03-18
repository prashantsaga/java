package pack1;

import java.io.File;

public class M9 {
	public static void main(String[] args) {
		File f1 = new File("abc");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());// make directory
		System.out.println(f1.exists());
	}

}
