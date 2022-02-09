package interviewQA;

import java.util.Arrays;

public class ArrayofSmallestAndLargest {
	public static void main(String[] args) {
		// int n[]= {-22, 77, 876543, 999, -2};
		float n[] = { -0.776f, 9.654f, 0.234f, -0.43f};
		float smallest = n[0];
		float largest = n[0];
		int length = n.length;
		System.out.println("Length of the Array:" + length);
		System.out.println(n[3]);
		for (int i = 1; i < n.length; i++) {
			if (n[i] > largest) {
				largest = n[i];
			} else if (n[i] < smallest) {
				smallest = n[i];
			}
			System.out.println("given array is" +Arrays.toString(n));
			System.out.println("Largest number is:" + largest);
			System.out.println("Smallest number is:" + smallest);
		}

	}
}
