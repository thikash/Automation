package encapculastion;

public class EmployeeData {
//Private variables:so these variables cannot be accessed directly from the outside the class
	// Encapsulation is another name is called data hiding
	// Encapsulation is OOps concept
	// PIE=Polymorphism,Inheritence,Encapsulation
	private int age;
	private int ssn;
	private String name;

	// Getter and Setter Methods: to set and get the values of the fields
	public int getempAge() {
		return age;
	}

	public void setempAge(int age) {
		this.age = age;
	}

	public int getempSsn() {
		return ssn;
	}

	public void setempSsn(int ssn) {
		this.ssn = ssn;

	}

	public String getempName() {
		return name;
	}

	public void setempName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		EmployeeData o = new EmployeeData();
		o.setempName("aathi");
		o.setempSsn(125689);
		o.setempAge(26);
		System.out.println("The Employee Name is:" + o.getempName());
		System.out.println("The Employee Age is:" + o.getempAge());
		System.out.println("The Employee SSN is:" + o.getempSsn());
		;
	}
}
