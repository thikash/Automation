package abstracts;

public abstract class RBI {
	//partial abstraction
	//hiding the implementation logic-abstract class
	//abstract class can have abstract method and non abstract method
	//can not create the object for abstract class
	//
	int g;
	int i=200;
	static String s="abstract class final";
	final double d=11.88;//final value print only dynamic polymorphism or top casting
	
	public abstract void loan();//abstract method no method body
	
	public void depit() {//non abstract method
		System.out.println("Depit--AbstractClass");
	}
	public void credit() {
		System.out.println("Credit--abstractClass");
		
	}
	public static void saving() {
		System.out.println("hai");
	}
	public final void chequebook() {
		System.out.println("final");
	}
	//RBI r=new RBI();

}
