package interviewQA;

import java.util.HashMap;
import java.util.Map;
public class CountEachchar{

	
public static void charCount(String n) {
	Map<Character, Integer> charMap=new HashMap<Character, Integer>();
	char[] charArray = n.toCharArray();
	for(char c:charArray) {
		if(charMap.containsKey(c)) {
			charMap.put(c,charMap.get(c)+1);
		}
		else {
			charMap.put(c, 1);
		}
	}
	System.out.println("Given input is:"+n+":"+"Count Each Character:"+charMap);

}
public static void main(String[] args) {
	charCount("aathipi");
}
}
