package constructor;

public class B extends A {

	public B() {
		super();
		
		
		System.out.println("Child Class Constructor");
	}
	public B(int i) {
		super(i);
	}
	public B(int i, int j) {
		super(i, j);
	}
	public B(int i, int j, int m) {
		super(i, j, m);
	}
	public static void main(String[] args) {
		B obj=new B();
		B obj1=new B(10);
		B  obj2=new B(22, 44);
		B obj3=new B(33, 55, 77);
		
	}
}
