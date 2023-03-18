package pack4;

public class A implements Cloneable
{
	
	int i;
	
	public static void main(String[] args) throws  CloneNotSupportedException {
		A a1 = new A();
		a1.i = 100;
		
		A a2 = (A)a1.clone();
		System.out.println(a2.i);
		System.out.println("-------");
		a1.i = 200;
		System.out.println(a2.i);
		a2.i = 300;
		System.out.println(a1.i);
	}
}
// compilation success
// cloning operation also unsecured.
// 1.you can not do directly cloning directly to request to runtime.
// 2.clone method within same class.
// 3. return type is object type.
// if attribute are derived type 