package inheritance;

public class Vechile {
	public void start() {
		System.out.println("vechile---START");
	}
	public void stop() {
		System.out.println("vechile---STOP");
	}
	public static void brake(){
		System.out.println("Brake--vechile");
	}
public void Car() {
	System.out.println("Vechile-----car");
	
}
public void Twowheeler() {
	System.out.println("vechile---twowheeler");
	
}
public  void Auto() {
	System.out.println("vechile-----Auto");
}
public  void bus() {
	System.out.println("vechile----bus");
	
}
/*When same method is present in parent class as well as in child class 
with the same name of arguments is called method overriding*/
public  void Yamaha() {
	System.out.println("yamaha---vechile");
}
/*When same method is present in parent class as well as in child class 
with the same name of arguments is called method overriding*/
public void Audi() {
	System.out.println("audi--vechile");
}
/*When same method is present in parent class as well as in child class 
with the same name of arguments is called method overriding*/

public void TVS() {
	System.out.println("TVS--vechile");
}

}

