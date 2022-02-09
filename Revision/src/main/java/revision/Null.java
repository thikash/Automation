package revision;

public class Null {
	static int i;
	static Null nc;
	static String s;
	
	
public static void main(String[] args) {
	Object obj=null;
	
	Integer i=null;
	Integer j=10;
	//Integer j=NULL;

System.out.println(obj);
System.out.println(i instanceof Integer);
System.out.println(j instanceof Integer);
 
Null ob=null;
System.out.println(ob.s);
System.out.println(ob.i);
//ob.samll();nullpointerException
ob.send();

String ss=(String) null;
System.out.println(ss+"aathi");
System.out.println(ss+"1234");
//System.out.println(ss.length());
System.out.println(ss.charAt(0));

}
public static void send() {
	System.out.println("static method");
}
public void samll() {
	System.out.println("non static method");
}
}
