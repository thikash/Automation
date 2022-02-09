package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorList {

	
	public static void main(String[] args) {
		
		Vector<Double> d = new Vector<Double>();
d.add(666.99);
d.add(777.999);
d.add(342.88);
System.out.println(d.size());
System.out.println(d);

Iterator<Double> it = d.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

Vector<Double> i = new Vector<Double>();
i.add(10.111);
i.add(44.555);
i.add(23.222);

System.out.println(i);

d.addAll(i);
System.out.println(d);
	
Collections.sort(d);
System.out.println(d);
	
	}
}
