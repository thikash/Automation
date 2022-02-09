package interfaces;

public interface RBIBANK {

	public void deposit(); 
	//int a;The blank final field a may not have been initialized
	
	int min=1000;
	static String ss="it is a interface";
	final double dd=777.98;
	
	public void Credit();

	
	public void HouseLoan();
	
	public void EducationLoan();
	
	public void CarLoan();
	/*
	 * only method declaration, no method body only method prototype
	 * in interface we can declare the variables, variables are by default static in nature
	 * var value will not changed, its final in nature
	 * no static method in interface
	 * no main method in interface
	 * we can no create the object of interface
	 * interface is abstract in nature
	 */
}
