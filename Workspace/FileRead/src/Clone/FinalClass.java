package Clone;

public class FinalClass {
	public FinalClass() {
		m1();
		m2();
	}
	
	public void m1(){
		System.out.println("m1");
	}
	
	public static void m2(){
		System.out.println("m2");
	}
	public static void main(String[] args) {
		FinalClass finalClass = new FinalClass();
	}
}
