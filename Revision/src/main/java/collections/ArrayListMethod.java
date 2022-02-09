package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("C", "C++", "java", "Ruby","java","C","java","Ruby","C"));
		System.out.println(a);
		System.out.println(a.size());

		ArrayList<String> b = new ArrayList<String>(Arrays.asList("Python", "JavaScript", "HTML", "PHP"));
		System.out.println(b);
		System.out.println(b.size());
		
		System.out.println("*****Clone method*****");
		ArrayList<String> cloneList=(ArrayList<String>)a.clone();
		System.out.println(cloneList);

System.out.println("*****Contains*****");
System.out.println(a.contains("java"));
System.out.println(a);
		System.out.println("*****Add a list to css value*****");
		a.add("CSS");
		System.out.println(a);
		System.out.println("*****get the a size*****");
		a.size();
		System.out.println(a);

		System.out.println("*****AddAll the b list to a list*****");
		a.addAll(b);
		System.out.println(a);
		System.out.println(a.size());

		System.out.println("*****Add the b list to a list 1st Index");
		a.addAll(1, b);
		System.out.println(a);
		System.out.println(a.size());

		System.out.println("*****Remove 3rd Index*****");
		a.remove(3);
		System.out.println(a);
		System.out.println(a.size());
		
		System.out.println("*****LastIndex*****");
	    int lastIndexOf = a.lastIndexOf("java");
	    System.out.println(lastIndexOf);
	    
	    System.out.println("*****IndexOf******");
	    int indexOf =a.indexOf("C");
	    System.out.println(indexOf);		
        System.out.println((a.indexOf("C")>1));
		System.out.println("*****Remove 4th Index*****");
		a.remove(4);
		System.out.println(a);
		System.out.println(a.size());

		System.out.println("***** Remove All b value*****");
		a.removeAll(b);
		System.out.println(a);
        System.out.println(a.size());
		
		System.out.println("*****Clear All*****");
		a.clear();
		System.out.println(a);
		System.out.println(a.size());
	    
		System.out.println("*****Remove Odd Number******");
        ArrayList<Integer> ai= new ArrayList<Integer>((Arrays.asList(1,2,3,4,5,6,7,8,9,10,11)));
        //boolean remove = ai.removeIf(num -> num%2!=0);//(num->num%2==1)
        //System.out.println(remove);
	    //boolean rem =
			ai.removeIf(numb -> numb%2!=1);
	    System.out.println(ai);
	    
	    System.out.println("*****Retain All*****");
	    ArrayList<String> as= new ArrayList<String>((Arrays.asList("aathi", "ragul", "ram", "rama", "aathi", "vishu", "aathi")));
	    as.retainAll(Collections.singleton("aathi"));
	    System.out.println(as);
	    
	    System.out.println("*****sublist******");
	    ArrayList<Integer> nu= new ArrayList<Integer>((Arrays.asList(11, 12 , 56, 77, 88, 99, 45, 36, 67, 29, 49, 27, 57)));
	    ArrayList<Integer> sublist= new ArrayList<Integer>(nu.subList(4, 10));
        System.out.println(sublist);
        
        System.out.println("*****toArray*****");
        ArrayList<String> name=new ArrayList<String>((Arrays.asList("aathi", "ram", "deepan", "vickky", "sabari", "swathi")));
        Object[] array = name.toArray();
        //System.out.println(array);Ljava.lang.Object;@5f8ed237
        System.out.println(Arrays.toString(array));
        
        for(Object obj:array) {
        	System.out.println(obj);
        	
        }
        
	}
}
