package generics;

public class Test {

	public static void main(String[] args) {
		
		m1(new C());
		
	}
	
	public static <T extends B> void m1(T t){
		System.out.println("Hureeeeeeeeeeeeeeee");
	}
	
	private void m1(final Integer i){
		
		class Local{
			final static int x = 10;
			void m2(){
				System.out.println(i);
			}
		}
		
	}

}
