package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompArraylist {

	public static void main(String[] args) {
ArrayList<Integer> comp1=new ArrayList<Integer>((Arrays.asList(1,2,3,4,5,6)));
ArrayList<Integer> comp2 = new ArrayList<Integer>((Arrays.asList(1,2,3,12,4,5,7,8,9)));
ArrayList<Integer> comp3 = new ArrayList<Integer>((Arrays.asList(5,6,4,3,2,1)));
Collections.sort(comp1);
Collections.sort(comp2);
Collections.sort(comp3);

System.out.println(comp1.equals(comp2));
System.out.println(comp2.equals(comp3));
System.out.println(comp3.equals(comp1));
	///Missing Element is 7
	comp2.removeAll(comp1);
	System.out.println(comp2);
	
	//Find out common Elements
	ArrayList<String> name1= new ArrayList<String>((Arrays.asList("aathi", "prakash", "srini", "vicky", "ram", "rama")));
	ArrayList<String> name2 = new ArrayList<String>((Arrays.asList("prakash", "aathi", "ram", "moorthy", "ragul", "priya")));
	name1.retainAll(name2);
	System.out.println(name1);
	}

}
