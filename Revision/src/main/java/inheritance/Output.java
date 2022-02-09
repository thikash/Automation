package inheritance;

public class Output {
	public static void main(String[] args) {

		// Static polymorphism complieTime Polymorphism
		Auto a = new Auto();
		a.bajaj();
		a.TATAAUto();
		a.TVS();
		a.bus();
		a.Auto();
		a.Car();
		a.Twowheeler();
		System.out.println("************");

		Bike b = new Bike();
		b.Honda();
		b.Hero();
		b.Suzuki();
		b.RoyalEnfield();
		b.Yamaha();
		b.bus();
		b.Auto();
		b.Twowheeler();
		b.brake();//The static method brake() from the type Vechile should be accessed in a static way
		System.out.println("*********************");

		Car c = new Car();
		c.start();
		c.Car();
		c.Auto();
		c.bus();
		c.Audi();
		c.stop();
		c.BMW();
		c.suzuki();

		
		
		/*
		 * child class object can be referred by parents class reference
		 * variable-Dynamic polymorphism or runtime polymorphism
		 */
		System.out.println("*********************");
		// Top casting
		Vechile v = new Car();
		v.start();
		v.stop();
		v.Audi();
		System.out.println("********************");
		// Top casting
		Vechile j = new Bike();
		j.Yamaha();
		j.stop();
		System.out.println("********************");
//Top casting
		Vechile f = new Auto();
		f.TVS();
		f.Car();
		f.Auto();
		
		
		//System.out.println("*****************");
		/*
		 * Down Casting Car s=new Vechile(); Type mismatch: cannot convert from Vechile
		 * to Car
		 */
		/*Car s = (Car) new Vechile();// Down Casting
		s.Audi();
		s.Auto();
		s.bus();
		s.Car();
		s.Twowheeler();
*/
		/*
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * inheritance.Vechile cannot be cast to class inheritance.Car
		 * (inheritance.Vechile and inheritance.Car are in unnamed module of loader
		 * 'app') at inheritance.Output.main(Output.java:68)
		 * 
		 */
		
	}
	public static void main(int i) {
		System.out.println("main method single parameter");
	}
	public static void main(int i , int j) {
		System.out.println("Mani method ");
	}
	
}
