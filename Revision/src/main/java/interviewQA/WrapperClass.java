package interviewQA;

public class WrapperClass {

	public static void main(String[] args) {
		String n="100";
		System.out.println("String add to: "+(n+20));
	//data conversion:String to int
		int i= Integer.parseInt(n);
		System.out.println("String to Integer add to:"+(i+40));
	//double 
		double j= Double.parseDouble(n);
		System.out.println("String to double add to:"+(j+50));
	//boolean
		String b="true";
		boolean c = Boolean.parseBoolean(b);
		System.out.println("String to Boolean:"+c);
		
		//integer to string
		int x=12;
		String z = String.valueOf(x);
		System.out.println("Integer to String:"+(z+100));
		
		String t="POWER:900watts #$%@^:;<>?|[] {}*().";
		System.out.println("Geniue String is:"+t);
		String r = t.replaceAll("[^!-/:-@]", "");
		System.out.println("Split the String only Special Character"+r);
		String replace=t.replaceAll("[^A-Z]", " ");
		System.out.println("Split the String only Uppercase (A-Z):"+replace);
		String repAll = t.replaceAll("[^a-z]", "");
		System.out.println("split the String only smaller case (a-z): "+repAll);
		String rep = t.replaceAll("[^0-9]","");
		System.out.println("split the String only number (0-9):"+rep);
		 int parseInt = Integer.parseInt(rep);
		System.out.println("Integer value:"+parseInt);
	
	}
}
