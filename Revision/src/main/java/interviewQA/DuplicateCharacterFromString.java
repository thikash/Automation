package interviewQA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterFromString {
	public static void printDuplicateCharacter(String s) {
		if (s == null) {// given input is null is the ouput is null the condition
			System.out.println("The value is NULL");
			return;
		}
		if (s.isEmpty()) {// Given input is empty "" so get the output is also empty
			System.out.println("Empty value");
		}
		if (s.length() == 1) {// given the input is only 1
			System.out.println("It is a single character from String");
		}
		char words[] = s.toCharArray();// string convert to character
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();//
		for (Character ch : words) {
			if (charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch) + 1);
			} else {
				charmap.put(ch, 1);
			}
		}
		// print the map
		Set<Map.Entry<Character, Integer>> entrySet = charmap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(
						"Duplicate values:" + entry.getKey() + "Number of Duplicate Values are=" + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		printDuplicateCharacter("A");
		printDuplicateCharacter("");
		printDuplicateCharacter(null);
		printDuplicateCharacter("Aathi  Prakash P");
		printDuplicateCharacter("Electronics And Communcation");
		printDuplicateCharacter("888899990");
		printDuplicateCharacter("10%,50%,60%,70%,75%");
		printDuplicateCharacter("&*()()__+_+^%^%^$^#@!@#@#");
	}
}
