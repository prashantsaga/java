package pack2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class M13 {
	public static void main(String[] args) {
		File f1 = new File("F:\\all_document\\12th_certificte\\Scan10006.JPG");// specify any image file and its path
		File f2 = new File("F:\\all_document\\12th_certificte\\Scanned.JPG"); // specify new file and its location

		FileInputStream fin = null;
		BufferedInputStream bin = null;
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		byte[] bytes = new byte[(int) f1.length()];
		try
		{
			fin = new FileInputStream(f1);
			bin = new BufferedInputStream(fin);
			fout = new FileOutputStream(f2);
			bout = new BufferedOutputStream(fout);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(bout != null)
			{
				try
				{
					bout.flush();
					bout.close();
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
			}
			if(fout != null)
			{
				try
				{

					fout.close();
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
			}
			if(bin != null)
			{
				try
				{

					bin.close();
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
			}
			if(fin != null)
			{
				try
				{

					fin.close();
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}

				System.out.println("done");
			}
		}
	}
}
