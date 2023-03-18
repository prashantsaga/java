package pack2;

import java.io.FileWriter;
import java.io.IOException;

public class M4 {
  public static void main(String[] args) {
	FileWriter fout = null;// just declaration not required try-catch
	try
	{
		fout = new FileWriter("f4.txt");
		fout.write("something");
		fout.write("some\nthing");
		fout.write("something");
	}
	catch(IOException ex)
	{
		ex.printStackTrace();
	}
	finally
	{
		if(fout != null)// reference check 
		{
			try
			{
				fout.flush();// flush() and close() are mandatory statement
				fout.close();// flush() and close() require try with catch
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	System.out.println("done");
}
}
