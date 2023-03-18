package pack2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class M9 {
	public static void main(String[] args) throws IOException {
		FileReader fin = new FileReader("b1.txt");
		BufferedReader bin = new BufferedReader(fin);
		String s1 = bin.readLine();// read line method returning true
		while(s1 != null)
		{
			System.out.println(s1);
			s1 = bin.readLine();
		}
		System.out.println("done");
				
	}

}
