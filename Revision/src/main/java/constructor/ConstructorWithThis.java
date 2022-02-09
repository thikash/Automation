package constructor;

public class ConstructorWithThis {
	String name;
	int i;
	String nam1;
	int j;
public ConstructorWithThis(String name, int i) {
	this.name=name;
	this.i=i;
	nam1=name;
	j=i;
	System.out.println("constructor");
	System.out.println(name);
	System.out.println(i);
	
}
public static void main(String[] args) {
	ConstructorWithThis c = new ConstructorWithThis("Aathi", 28);
}
}
