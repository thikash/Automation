package interviewQA;

public class String_whiteSpace {
	public static void main(String[] args) {
		// Input String is " welcome To Madurai !"
		String s = new String("    welcome To M  a du r ai    !" + "\n Jasmine" + "\n temple city"
				+ "\n  thoonganagaram \t" + "\t vaigai");
		System.out.println("Input String is:" + s);
		// remove whitespace using TRIM
		System.out.println("Output String with trim is:" + s.trim());
		// remove whitespace using REPLACEALL
		System.out.println("output String with replace all:" + s.replaceAll("\\s+", ""));
		// remove whiteSpace using for loop with if condition /n & ' '
		String nowhiteSpace = "";
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) != ' ') & (s.charAt(i) != '\t')) { // & (s.charAt(i))!='\n') {
				nowhiteSpace = nowhiteSpace + s.charAt(i);
			}
			
		}
		System.out.println("output String with for loop /n& ' ':" + nowhiteSpace);
		
		String[] split = s.split("\\s");

		StringBuffer b = new StringBuffer();
		for (String e : split) {
			b.append(e);
			System.out.println(b);
		}
		System.out.println("Output String with for each:" + b);
	}

}
