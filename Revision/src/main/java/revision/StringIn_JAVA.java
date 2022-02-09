package revision;

public class StringIn_JAVA {
public static void main(String[] args) {
	//+ is concatenation operator
	String s1="aathi";
	String s2="prakash";
	int a=19;
	int b=6;
	double c=10.77;
	double d=10.23;
	System.out.println(a+b);
	System.out.println(c+d);
	System.out.println(s1+s2);
	System.out.println(a+s1+c+s2+b+d);
	System.out.println(s1+s2+a+b+c+d);
	System.out.println(a+b+s1+c+d+s2);
	System.out.println(c+d+a+b+s1+s2);
	System.out.println(a+b+d+c+s1+s2);
	System.out.println(b+d+a+c+s2+s1);
	System.out.println(a+d+s1+c+b+s2);
	System.out.println(d+b+c+a+s1+s2);
	System.out.println(s1+a+s2+b+c+d);
	System.out.println(a+c+s1+b+d+s2);
	System.out.println(a+b+c+d+s2);
	System.out.println(a+d+s1);
	System.out.println("The Integer a value is:"+a);
	System.out.println("The Integer b value is:"+b);
	System.out.println("The Addition of a+b value is:"+a+b);
	System.out.println("The Addition of a+b value is:"+(a+b));
	System.out.println("The double c value is:"+c);
	System.out.println("The double d value is:"+d);
	System.out.println("The Additon of double value is:"+c+d);
	System.out.println("The Addition of double value is:"+(c+d));
	System.out.println("The String value S1 is:"+s1);
	System.out.println("The String value S2 is:"+s2);
	//println is used to print on the console a with a new line
	System.out.println("The Addition of String value is:"+s1+s2);
	System.out.println("The Addition of String value is:"+(s1+s2));
	//print=is just used to print on the console
	System.out.print(s1+s2);
	System.out.print(a+b);
}
}
