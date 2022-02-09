package revision;

public class StaticAndNonStatic {
	// Global var: the scope of the global variable wil be available across the all the function with same condition.
	static String name = "Aathi prakash";// Static variable
	static int age = 26;// Static variable
	float height = 5.6f;// non Static variable
	int weight = 90;// non Static variable

	public static void details() {// Static Method
		System.out.println("Details Method");
		String dept = "ECE";
		System.out.println(dept);
	}

	public void information() {// Non Static Method
		System.out.println("information Method");
		String skills = "selenium Java";
		System.out.println(skills);
	}

	public static void main(String[] args) {
		System.out.println("*****Direct Calling*****");
		details();
		System.out.println("*****Calling by className*****");
		StaticAndNonStatic.details();
		System.out.println("*****Calling by className*****");
		System.out.println("CandidateName:" + StaticAndNonStatic.name);
		System.out.println("*****Direct calling*****");
		System.out.println("Age:" + age);
//System.out.println(dept);
		// System.out.println(skills);

		/*
		 * System.out.println("Height:"+height); System.out.println("Weight:"+weight);
		 * Cannot make a static reference to the non-static field height and weight
		 */
		System.out.println("How to call non-static method variable?'\n' we can create refernce object");
		System.out.println("*****StaticAndNonStatic s = new StaticAndNonStatic();*****");
		StaticAndNonStatic s = new StaticAndNonStatic();
		System.out.println("Height:" + s.height);
		System.out.println("Weight:" + s.weight);
		// s.skills;
		System.out.println(
				"*****can we access static methods by using object refernce?\n yes,Warning will be given*****");
		System.out.println("Name:" + s.name);
		System.out.println("*****The static field StaticAndNonStatic.name should be accessed in a static way*****");
		System.out.println("Age:" + s.age);
		System.out.println("*****The static field StaticAndNonStatic.age \n be accessed in a static way*****");
		s.details();
		System.out.println(
				"*****The static method details() from the type StaticAndNonStatic \n should be accessed in a static way*****");

		System.out.println("*****NonStatic Method*****");
		s.information();

	}
}
