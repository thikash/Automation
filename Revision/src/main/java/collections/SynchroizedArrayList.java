package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;



public class SynchroizedArrayList {

	public static void main(String[] args) {

		List<String> nameList= Collections.synchronizedList(new ArrayList<String>()) ;
		nameList.add("67");
		nameList.add("55");
	nameList.add("89");
		nameList.add("28");
		System.out.println(nameList);
		nameList.remove(2);
		//we don't have explicit synchronization for add and remove
		// to fetch /traverse the values from the list, we have to use explicit synchronization 
		synchronized(nameList) {
			Iterator<String> it = nameList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		
		//2.CopyOnWriteArrayList
		CopyOnWriteArrayList<String> cwa= new CopyOnWriteArrayList<String>();
		//We don't have explicit Synchronized for add , remove and traverse because it's thread safe
		cwa.add("aa");
		cwa.add("bs");
		cwa.add("llkc");
		cwa.add("ghbn");
		cwa.add("uinv");
		System.out.println(cwa);
		Iterator<String> ite = cwa.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
