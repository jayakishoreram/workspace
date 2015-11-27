package generics;

public class NonStaticClass extends StaticClass{

	public void m1(){
		System.out.println("I am in non static.");
		mm();
	}
	
	public static void main(String[] args) {
		NonStaticClass.m();
		NonStaticClass nonStaticClass = new NonStaticClass();
		nonStaticClass.m1();
	}
}
