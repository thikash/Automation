package interviewQA;

public class StringManipulation {
public static void main(String[] args) {
	String str="it been rain on and off";
	String str1="IT been rain on and off";
	String str2="   You Learn Java first and move to selenium    ";
	System.out.println(str.length());
	System.out.println(str.charAt(6));
	
	System.out.println(str.indexOf('n'));//first occurance of 'n'
	System.out.println(str.indexOf('n', str.indexOf('n')+1));//second occurance of 'n'
	System.out.println(str.indexOf('n', 12));//third occurance of 'n'
	System.out.println(str.indexOf('n', 15));//fourth occurance of 'n'
	//comparison
	System.out.println(str.equals(str1));
	System.out.println(str.equalsIgnoreCase(str1));
//remove space
	System.out.println(str2.trim());
	System.out.println(str2.replaceAll(" ", ""));
	//date of birth
	String date= "12_05_1995";
	System.out.println(date.replaceAll("_","/"));
	
	String splitStr[]=str.split(" ");
	for (int i = 0; i < splitStr.length; i++) {
		System.out.println(splitStr[i]);
	}
	
}
}