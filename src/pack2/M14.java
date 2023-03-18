package pack2;

import java.io.PrintStream;

public class M14 {
	public static void main(String[] args) {
		System.out.print("hello");
		PrintStream p1 = System.out;
		p1.println("done");
		p1.println("test");
		p1.println("test");
		p1.println("test");
		p1.println("test");
	}

}
/*
   SKELETON OF SYSTEM CLASS
   ---------------------------
  public class System
  {
   public static PrintStream out;
   
   static
   {
        out = // initializing to command prompt (console)
   }
   public static void setOut(PrintStram p1) 
   {
		out = p1;
   }
     // some more methods
   
*/