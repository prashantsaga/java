package pack2;
// which will print log file and which will print console
// important interview
import java.io.IOException;
import java.io.PrintStream;

public class M16 {
	public static void main(String[] args) throws IOException {
		PrintStream p1 = new PrintStream("log.txt");// p1 is abhron object
		PrintStream p2 = System.out;// not abron print stream// p2 is a default object
		p1.println(1);// file
		p2.println(2);// console
		System.out.println(3); // c-console
		System.setOut(p1);// out is changing to log file  system.out target changed
		p1.println(4); // file
		p2.println(5); // console
		System.out.println(6); // file
		System.setOut(p2); // binding the console, now system.out coming back to console
		p1.println(7); // file
		p2.println(8); // console
		System.out.println(9); // console
	}
}
/*
 Out put
2
3
5
8
9

*/