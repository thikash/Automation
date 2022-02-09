package constructor;

public class ConstructorConcept {

	public  ConstructorConcept() {
		System.out.println("Default constructor");
	}
	public ConstructorConcept(int i) {
		System.out.println("one parameter");
		System.out.println("The Value of i is:"+i);
		
	}
	public ConstructorConcept(int i, int j) {
		System.out.println("Two parameters");
		System.out.println("The value of i is:"+i);
		System.out.println("The value of j is:"+j);
	}
	public static void main(String[] args) {
		ConstructorConcept cc=new ConstructorConcept();
		ConstructorConcept obj=new ConstructorConcept(10);
		ConstructorConcept ob=new ConstructorConcept(20, 50);
		
	}
	
}
