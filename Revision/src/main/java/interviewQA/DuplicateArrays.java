package interviewQA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateArrays {
	public static void main(String[] args) {
		String names[] = { "C", "C++", "c", "Python", "Ruby", "java", "javaScript", "C++", "Ruby" };
		// HashSet: it's not allowed duplicates
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate Number is" + name);
			}
		}
		// It is normal method -worst method. Time Complexity O(n)
		System.out.println("******************");
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate Number is:" + names[i]);
				}
			}
		}
	//Using map. Time complexity is O(2n)
		Map <String, Integer> storemap=new HashMap<String, Integer>();
	for(String name:names) {
		Integer count=storemap.get(name);
		if(count==null) {
			storemap.put(name, 1);
		}
		else {
			storemap.put(name, ++count);
			
		}
	}
	Set<Entry<String, Integer>> entrySet=storemap.entrySet();
	for(Entry<String, Integer>entry:entrySet) {
		if(entry.getValue()>1) {
			System.out.println("duplicate value is:"+entry.getKey());
		}
	}
	}
	
}
