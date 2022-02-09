package collections;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {
	//its not synchronized
	//its a highly performance java collection member
	//faster than HashSet
	//all the methods are implemented using bitwise arithmetic operations.

	enum Lang{
		Java, CSharp, JavaScript, Python, CPlus, C;
	}
	public static void main(String[] args) {

//Created a new enumSet using enumSet
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);
	
	//empty enum set:
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);
		
		//range(e1, e2):
		EnumSet<Lang> enumRange = EnumSet.range(Lang.Java, Lang.Python);
		System.out.println(enumRange);
	//of:
		EnumSet<Lang> c = EnumSet.of(Lang.C);
		System.out.println(c);
	
		EnumSet<Lang> m = EnumSet.of(Lang.Python, Lang.CSharp);
		System.out.println(m);
		
		// add and addAll();
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		System.out.println(lang1);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		System.out.println(lang2);
		lang2.add(Lang.JavaScript);
		System.out.println(lang2);
		lang2.addAll(lang1);
		System.out.println(lang2);
	
		//how to iterate EnumSet iterator:
		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
		for(Lang n:fullLang) {
			System.out.print(n);
			System.out.println(",");
			
		
	}
	Iterator<Lang> it = fullLang.iterator();
	while(it.hasNext()) {
		System.out.print(it.next());
		System.out.print(" , ");
	}
	
	EnumSet<Lang> r= EnumSet.allOf(Lang.class);
	System.out.println(r);
	
	boolean b=r.remove(Lang.CPlus);
	System.out.println(b);
	System.out.println(r);
	boolean rem=r.removeAll(r);
	System.out.println(rem);
	}

}
