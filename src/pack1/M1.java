package pack1;

import java.io.File;

public class M1 {
	public static void main(String[] args) {
		File f1 = new File("test.txt");
		System.out.println(f1.exists());// f1 object to file
		File f2 = new File("src/pack1/M1.java");
		System.out.println(f2.exists());
	}

}
