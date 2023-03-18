package pack1;

import java.io.File;
import java.io.IOException;

public class M8 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("G:\\abc\\hello.txt");
		f1.createNewFile();
		System.out.println("done");
	}

}
