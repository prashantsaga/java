package pack2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class M12 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("F:\\all_document\\12th_certificte\\Scan10006.JPG");// specify any image file and its path
		File f2 = new File("F:\\all_document\\12th_certificte\\Scanned.JPG"); // specify new file and its location
		FileInputStream fin = new FileInputStream(f1);
		BufferedInputStream bin = new BufferedInputStream(fin);
		FileOutputStream fout = new FileOutputStream(f2);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		byte[] bytes = new byte[(int) f1.length()];
		bin.read(bytes);
		bout.write(bytes);
		bout.flush();
		bout.close();
		bout.close();
		bin.close();
		fin.close();
		System.out.println("done");
	}
}
// reader and writer only for character file.
// for binary file read and write binary content.