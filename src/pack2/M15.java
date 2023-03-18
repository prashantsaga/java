package pack2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class M15 {
	public static void main(String[] args) throws IOException {
		PrintStream p1 = new PrintStream("log.txt");
		p1.println("some thing");
		p1.println("some thing");
		p1.println("some thing");
		p1.println("some thing");
		p1.println("some thing");
		System.out.println("done");
	}
}
