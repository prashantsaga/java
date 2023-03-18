package pack4;
class B
{
	int i;
}
public class C implements Cloneable
{
	int j;
	B obj;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		B b1 = new B();
		b1.i = 100;
		C c1 = new C();
		c1.obj = b1;
		c1.j = 20;
		
		C c2 = (C) c1.clone();
		System.out.println(c2.obj.i);
		System.out.println(c2.j);
		
		System.out.println("------");
		c2.obj.i = 5000;
		c2.j = 40;
		
		System.out.println(c1.obj.i);
		System.out.println(c1.j);
		
		System.out.println("------");
		c1.obj.i = 8000;
		c1.j = 40;
		
		System.out.println(c2.obj.i);
		System.out.println(c2.j);
	}
}
