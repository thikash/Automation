package constructor;

public class A {

	public A() {
		System.out.println("Parent Class Constructor");
	}
	public A(int i) {
		
		System.out.println("Single Parameter Parent Class"+i);
		
	}
	public A(int i, int j) {
		System.out.println("Two Parameters Parent Class"+i);
		System.out.println("Two Parameters Parent Class"+j);
		System.out.println("Two Parameters Parent Class Add:"+(i+j));
		
	}
	public A(int j, int m, int n) {
		
		System.out.println("Three Parameters--Parent Class"+j);
		System.out.println("Three Parameters--Parent Class"+m);
		System.out.println("Three Parameters--Parent Class"+n);
		System.out.println("Three Parameters Parent Class"+(j+m+n));
	}
	
}
