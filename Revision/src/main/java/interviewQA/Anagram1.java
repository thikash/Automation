package interviewQA;

import java.util.Arrays;

public class Anagram1 {
public static boolean isAnagram(String s, String q) {
	String str1=s.replaceAll("\\s", "");
	String str2=q.replaceAll("\\s", "");
	if(str1.length()!=str2.length()) {
		return false;
		
	}else {
			char c1[]=str1.toLowerCase().toCharArray();
			char c2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
	
}
public static void main(String[] args) {
System.out.println(isAnagram("Listen", "silent"));	
System.out.println(isAnagram("dan", "and"));
System.out.println(isAnagram("voice", "passive"));
}
}

