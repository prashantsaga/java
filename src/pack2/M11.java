package pack2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class M11 {
	public static void main(String[] args) {
		FileReader fin = null;
		BufferedReader bin = null;
		try
		{
			fin = new FileReader("b2.txt");
			bin = new BufferedReader(fin);
			String s1 = bin.readLine();
			while(s1 != null)
			{
				System.out.println(s1);
				s1 = bin.readLine();
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
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
			}
			System.out.println("done");
		}
	}
}
