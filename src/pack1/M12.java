package pack1;

import java.io.File;
import java.util.Arrays;

public class M12 {
	public static void main(String[] args) {
		File f1 = new File("E:/");
		File[]list = f1.listFiles();
		for(File file : list)
		{
			System.out.println(file.getName() + ":" + file.isFile());
		}
	}
}
