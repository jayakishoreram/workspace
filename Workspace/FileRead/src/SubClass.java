
public class SubClass extends SuperClass{

	public static void main(String[] args) {
		System.out.println("Const : "+ SUPERCONST);
		SubClass subClass = new SubClass();
		subClass.m1();
		
	}
	
	public void m1(){
		
		System.out.println("Const : "+ SUPERCONST);
	}
}
