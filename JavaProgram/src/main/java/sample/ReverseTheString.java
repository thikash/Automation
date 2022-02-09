package sample;

public class ReverseTheString {

	public static void main(String[] args) {

		
		String n="Aathi Pirakash P";
		System.out.println("the input string is:"+n);
	String rev=	"";
	int length = n.length();
	System.out.println("length of the String is:"+length);
	String replaceAll = n.replaceAll(" ", "");
	System.out.println("Remove Space:"+replaceAll);
	int length2 = replaceAll.length();
String removeUC = replaceAll.replaceAll("[^a-z]", "");
System.out.println("Remove uppercase:"+removeUC);
System.out.println("Length of the String is:"+length2);
		
		for (int i =length-1; i>=0; i--) {
			rev=rev+n.charAt(i);
			
		}
		System.out.println("Reverse the String;"+rev);
	}

}
