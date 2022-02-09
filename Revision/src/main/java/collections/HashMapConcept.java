package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//no order - no indexing
		//stores values-key value<k,v>
		//key can't be duplicate
		//can store n number of null values but only one null key
		//hashMap is not thread-safe -unsynchronized
		HashMap <String, String> hm = new HashMap<String, String>();
		hm.put("java", null);
		hm.put("C++", "pointer");
		hm.put("C++", "OOPS");
		hm.put("python", "Dictonaries");
		hm.put("C", "pointer");
		hm.put("HTML", "javaScripts");
		System.out.println(hm);
		System.out.println("**************");
		System.out.println(hm.get("C++"));
		System.out.println(hm.get("javaScripts"));
		System.out.println("***************");
		Iterator<String> it = hm.keySet().iterator();
	while(it.hasNext()) {
		String key=it.next();
		String Value=hm.get(key);
		System.out.println("key is:"+key+ "value is:"+Value);
	}
	System.out.println("*****************");
hm.values().stream().forEach(e -> System.out.println(e));
	System.out.println("***********");
	Iterator<Entry<String, String>> ite = hm.entrySet().iterator();
	System.out.println("************");
	while(ite.hasNext()) {
		Entry<String, String> next = ite.next();
		System.out.println("key:"+next.getKey()+ "Value:"+next.getValue());
	

	}
	System.out.println("**************");
	hm.forEach((k,v) -> System.out.println("key=" + k + " and value =" +v));
	}

}
