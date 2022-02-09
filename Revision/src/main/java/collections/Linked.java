package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		
		//LinkedList is default class in Java
		//It can be used as List, Stack, Queue
		//It allows the null entry
		//Dynamic Collections
		//Hence Insertion and Deletion can be easily implemented
		//It can contain Duplicate contains
		//It is not Synchronized(not thread safe)
		//In LinkList  manipulation is fast because we don't need any shifting
		//

		LinkedList<String> name = new LinkedList<String>();
		System.out.println(name.size());
		name.add("aathi");
		System.out.println(name.size());
		name.add("rama");
		System.out.println(name.size());
		name.add("rama");
		name.add("aathi");
		System.out.println("Given the Input List is:"+name);
		
		//typical for loop
		System.out.println("*****Typical for Loop*****");
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		} 
		//JDK Lambda 8
		System.out.println("*****JDK Lambda 8*****");
		name.forEach(e -> System.out.println(e));
			 
		//Iterator
		System.out.println("*****Iterator*****");
		Iterator iter = name.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//for Each
		System.out.println("*****for each*****");
		for(String n:name) {
			System.out.println(n);
		}
		System.out.println("given input get index 1:"+name.get(1));
		
		name.add(3, "ragul");
		
		name.add(4,"ram");
		
		LinkedList<String> n= new LinkedList<String>();
		n.add("Gowsiya");
		n.add("kavi");
		n.add("priya");
		n.add("hema");
		n.add("sharmi");
		System.out.println("Given input 2nd list::"+n);
		name.addAll(n);
		System.out.println("Add the list 2 and 1:"+name);
		name.addAll(3, n);
	System.out.println("Add the list 2 start with index 3:"+name);
	
	
	name.addFirst("bessy");
	System.out.println(name);
	
	n.retainAll(name);
	System.out.println(name);
	System.out.println(name.contains("hema"));
	System.out.println(name.containsAll(n));
	
	LinkedList<String> sub= new LinkedList<String>();
	sub.add("Tamil");
	sub.add("English");
	sub.add("Maths");
	sub.add("Science");
	sub.add("SocialScience");
	
	Collections.sort(sub);
	System.out.println(sub);
	
	Iterator<String> desIt = sub.descendingIterator();
	while(desIt.hasNext()) {
		System.out.println(desIt.next());
	}
	
	}

	}


