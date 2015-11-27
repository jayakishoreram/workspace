package generics;

public class C extends B {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		Object obj = b;
		A a1 = (A)obj;
		B b1 = (B)obj;
	}
}
