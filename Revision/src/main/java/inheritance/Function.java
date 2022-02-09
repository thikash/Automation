package inheritance;

public class Function {
	
	public void test() {
		System.out.println("it is the test Method");
	}

	public int value(int x, int y) {
		System.out.println("multiplication");
		int z = x * y;
		return z;
	}

	public int add() {
		System.out.println("addition");
		int x = 10;
		int y = 23;
		int z = x + y;
		return z;

	}

	public String str() {
		System.out.println("String");
		String s = "selenium Java";
		return s;
/*can't create a function inside a function
 * public void dec(){
 * system.out.println("long");
 * }
 */
	}

	/*//duplciate function can't be allowed same method name and 
	 * same number of Aruguments not allowed//
	 * public String str() { //duplicate method str() in type Function
	 * System.out.println("String"); String s="selenium Java"; return s;
	 * 
	 * 
	 * }
	 */
	public String str(String a, String b) {
		System.out.println("String");
		String s = a + b;
		StringBuffer d = new StringBuffer(s);
		StringBuffer reverse = d.reverse();
		System.out.println("Reverse the String:" + reverse);
		return s;
}
	public String str(String s) {
		System.out.println("String Method No input");
		
		int length = s.length();
		String rev="";
		System.out.println("Length of String is:"+length);
		for (int i =length-1; i >= 0; i--) {
			rev=rev+s.charAt(i);
			
		}
		return rev;
	}
//Method overloding:When in the same class, function are having same name and different parameter
	public float div(float y, float s) {
		System.out.println("Float Div Method two parameter");
		float a = y / s;
		return a;
		//void does not support return value

		// function independent to each other
		// function parallel to each other
		//Main method dose not have return any value, hence it is void
		
	}
	public float div(float b) {
		System.out.println("Float Div Method one Parameter");
		float d=b;
		return d;	
	}
	public float div() {
		System.out.println("Float Div Method no input");
		float a=7.8f;
		float b=8.2f;
		float c=a/b;
		return c;
	}
	public static void main(String[] args) {
		Function obj = new Function();
		//one object is created, obj is the reference variable, referring to this object
		//after creating the object, copy of all non static method will be given to this object 
		int add = obj.add();
		System.out.println(add);
		obj.test();
		String str = obj.str();
		System.out.println(str);
		float div = obj.div(28, 67);
		System.out.println(div);
		int value = obj.value(89, 165);
		System.out.println(value);
		String str2 = obj.str("selenium", "java");
		System.out.println(str2);
		float div2 = obj.div();
		System.out.println(div2);
		float div3 = obj.div(18);
		System.out.println(div3);
			
String str3 = obj.str(" Madurai is a Beautiful city  ");
System.out.println(str3);
System.out.println(str3.trim());
String replaceAll = str3.replaceAll(" ", "");
System.out.println(replaceAll);
	
	}

}
