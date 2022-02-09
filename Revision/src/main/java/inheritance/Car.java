package inheritance;

public class Car extends Vechile {

	public void start() {
		System.out.println("CAR---START");
	}
	public  void BMW() {
	System.out.println("BMW--car");
}
	/*When same method is present in parent class as well as in child class 
	  with the same name of arguments is called method overriding*/
public  void Audi() {
	
	System.out.println("Audi--car");
}

public  void suzuki() {
	System.out.println("suzuki---car");
}
public  void TATA() {
	System.out.println("Tata---car");
}
}
