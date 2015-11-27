package generics;

public class AIC {
	String a;
	public AIC(String a){
		this.a = a;
	}
	
	public void m1(){
		System.out.println("M1");
	}
	
	public static void main(String[] args) {
		
		AIC aic = new AIC("M3"){
			@Override
			public void m1(){
				System.out.println(a);
			}
		};
		
		aic.m1();
	}

}
