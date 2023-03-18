package pack2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class M10 {
	public static void main(String[] args) {
		FileWriter fout = null;
		BufferedWriter bout = null;
		try
		{
			fout = new FileWriter("b2.txt");// the raw functionality
			bout = new BufferedWriter(fout);
			bout.write("abc test");
			bout.newLine();
			bout.write("abc test");
			bout.newLine();
			bout.write("abc test");
			bout.newLine();
			bout.write("abc test");
			bout.newLine();
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
			if(bout != null)
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
			System.out.println("done");
		}
	}
}
