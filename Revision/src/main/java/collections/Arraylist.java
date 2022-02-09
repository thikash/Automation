package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {

		System.out.println("*****Array*****");
		int[] n = new int[3];
		System.out.println("The size of n is:" + n.length);
		System.out.println(n[1]);
		System.out.println(n[2]);
		// System.out.println(n[3]);ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
 ArrayList<Object> obj= new ArrayList<Object>((Arrays.asList("aathi",'p', 1000, 3333.45, 2.4455, 909876)));
Iterator<Object> ite = obj.iterator();
while(ite.hasNext()) {
	System.out.println(ite.next());
}

		System.out.println("*****ArrayList*****");
		ArrayList<Object> al = new ArrayList<Object>();
		System.out.println(al.size());// Physical Capacity=0
		al.add("Aathi");
		System.out.println(al.size());
		al.add('p');
		al.add(90);
		al.add(5.4);
		al.add(90.23);
		al.add(true);
		System.out.println("The length of the ArrayList is:" + al.size());

		al.add(83446894);
		System.out.println(al);

		System.out.println("*****Virtual Capacity in ArrayList*****");

		ArrayList<Object> a = new ArrayList<Object>(5);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(81.9);
		a.add(999.00);
		a.add('E');
		a.add("List");
		a.add(true);
		System.out.println(a);
		System.out.println(a.size());

		System.out.println("*****ArrayList Iteration*****");

		ArrayList<String> s = new ArrayList<String>();
		s.add("aathi");
		s.add("prakash");
		s.add("p");
		s.add("aathi");
		s.add("prakash");

		System.out.println("*****typical for loop*****");

		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}

		System.out.println("*****for each loop*****");

		for (String name : s) {
			System.out.println(name);
		}

		System.out.println("*****JDK 8 Streams with Lambda*****");
		s.stream().forEach(e -> System.out.println(e));

		System.out.println("*****iterator*****");
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("*****List With Other Collections*****");
		ArrayList<Integer> in= new ArrayList<Integer>((Arrays.asList(70,80, 60,55,44)));
		System.out.println(in);

	}

}
