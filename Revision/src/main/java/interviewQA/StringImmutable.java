package interviewQA;

public class StringImmutable {
public static void main(String[] args) {
	String s="java";
	String a="java";
	String b="c++";
	a="c";
	System.out.println(s);
	System.out.println(a);
	System.out.println(b);
	System.out.println(a);
}
}
