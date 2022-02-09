package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<Integer> dup = new LinkedHashSet<Integer>((Arrays.asList(1,2,3,4, 5,6,7,8,2,1,4,5,6,7,8,1,2,3,4,5,6)));

System.out.println(dup);
System.out.println(dup.size());


ArrayList<Integer> num= new ArrayList<Integer>((Arrays.asList(22,44,55, 66, 77,88,22,33,44,55,66,77,33)));
int size = num.size();
System.out.println(size);


LinkedHashSet<Integer> d= new LinkedHashSet<Integer>(num);
System.out.println("The Original Number:"+d.size());
System.out.println(d);

	
	
	//JDK 8
ArrayList<Integer> n= new ArrayList<Integer>((Arrays.asList(2,3,4,5,3,4,2,1,5,7,2,4,5,4,3,3)));
System.out.println("The size of ArrayList Is:"+n.size());
List<Integer>  dupnum = n.stream().distinct().collect(Collectors.toList());
	System.out.println(dupnum);
	System.out.println("The Stream of List is :"+dupnum.size());
	}

}
