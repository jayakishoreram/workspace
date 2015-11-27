package Clone;

public class CloneClass implements Cloneable {

	int i = 10;
	public CloneClass(int i) {
		this.i = i;
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		CloneClass classC = new CloneClass(20);
		CloneClass cloneClass = (CloneClass)(classC.clone());
		System.out.println("THIS: "+classC);
		System.out.println("THIS: "+cloneClass);
		System.out.println("THIS: "+classC.i);
		System.out.println("THIS: "+cloneClass.i);
	}
}
