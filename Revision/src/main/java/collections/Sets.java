package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static void main(String[] args) {
		
		Set<Object> st= new HashSet<Object>();
		st.add(1000);
		st.add("aathi");
		st.add('b');
		st.add(111.999);
		st.add(9.43);
		st.add(1000);
		st.add('b');
		st.add("aathi");
		st.add('B');
		st.add('B');
		System.out.println(st.size());
		for(Object n:st) {
			System.out.println(n);
		}
		System.out.println(st);
		st.remove('B');
		st.remove(45);
		System.out.println(st);
		System.out.println(st.size());
		
		Set<Integer> f = new HashSet<Integer>();
		f.addAll((Arrays.asList(1,0,3,4,6,4,5,3,4,5,11,11)));
		
		Set<Integer> s = new HashSet<Integer>();
		s.addAll((Arrays.asList(0,13,2,55,5,6,7,8,9,10,11)));
		
	Set<Integer> Unions = new HashSet<Integer>(f);
	Unions.addAll(s);
	System.out.println(Unions);
		
		Set<Integer> intersection = new HashSet<Integer>(f);
		intersection.retainAll(s);
		System.out.println(intersection);
		
		//difference between f and s
		Set<Integer> diff = new HashSet<Integer>(f);
		diff.removeAll(s);
		System.out.println(diff);
		
		//difference between s and f
		Set<Integer> diff2 = new HashSet<Integer>(s);
		diff2.removeAll(f);
		System.out.println(diff2);
	}

}
