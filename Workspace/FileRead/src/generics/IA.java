package generics;

public class IA {

	public static void main(String[] args) {
		I i = new I(){
			public void m1(){
				System.out.println("M1");
				m2();
			}
			
			public void m2(){
				System.out.println("M2");
			}
		};
		i.m1();
	}
}
