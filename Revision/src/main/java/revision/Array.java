package revision;

import java.util.Arrays;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {

		String str[] = { "Aathi", "Praveen", "Prakash", "kumar" };
		int num[] = { 10, 20, 50, 40, 60 };
		float f[] = { 0.1f, 0.2f, 0.3f, 0.4f };
		char c[] = { 'a', 'b',  'd' };
		double[] d = { 0.00, 0.11, 0.22, 0.44 };
		int numIndex = num[2];
		System.out.println(numIndex);
		System.out.println("*****************************");
		String strIndex = str[3];
		System.out.println(strIndex);
		System.out.println("*****************************");
		float fIndex = f[0];
		System.out.println(fIndex);
		System.out.println("*****************************");
		char cIndex = c[1];
		System.out.println(cIndex);
		System.out.println("*****************************");
		double dIndex = d[2];
		System.out.println(dIndex);
		System.out.println("*****************************");
		int charLength = c.length;
		System.out.println(charLength);
		System.out.println("***********************");
		for (int i = 0; i < d.length - 1; i++) {
			System.out.println("double[" + i + "]:" + d[i]);

		}
		System.out.println("*****************************");
		for (int i = 0; i < str.length; i++) {
			System.out.println("String[" + i + "]:" + str[i]);

		}
		System.out.println("*****************************");
		for (int i = 0; i < c.length; i++) {
			System.out.println("Character[" + i + "]:" + c[i]);

		}
		System.out.println("*****************************");
		for (int i = 0; i < d.length; i++) {
			System.out.println("Double[" + i + "]:" + d[i]);

		}
		System.out.println("*****************************");
		for (int i = 0; i < f.length; i++) {
			System.out.println("Float[" + i + "]:" + f[i]);

		}
		System.out.println("*****************************");
		for (int i = 0; i < num.length; i++) {
			System.out.println("Integer[" + i + "]:" + num[i]);

		}
		System.out.println("************Sort the Array*****************");
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++) {
			System.out.println("String[" + i + "]:" + str[i]);
		}
		
		System.out.println("*****************************");
		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.println("Character[" + i + "]:" + c[i]);

		}
		
		System.out.println("*****************************");
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println("Integer[" + i + "]:" + num[i]);
		}
		
		

		
		System.out.println("Largest Element of the Array is:" + num[num.length - 1]);
		

		System.out.println("*****************************");
		System.out.println("Largest Element of the Array is:"+c[c.length - 2]);
		
		
		System.out.println("***********Reverse Order******************");
	Collections.reverse(Arrays.asList(str));
	for(int i=0; i<str.length; i++) {
		System.out.println("ReverseOrder["+i+"]:"+str[i]);
	}
	System.out.println("Smallest number of the array is :"+str[str.length-1]);
	System.out.println("*****The Program End*****");
	
	}
	
}
