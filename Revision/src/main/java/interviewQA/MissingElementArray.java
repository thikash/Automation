package interviewQA;

public class MissingElementArray {
	public static void main(String[] args) {
		/*
		 * int a[]={0,1,2,3,4,6,7,8,9,10,11,13}; 
		 * 0+1+2+3+4+5+6+7+8+9+10+12=67 for:j
		 * 0+1+2+3+4+5+6+7+8+9+10+11+12=78 
		 * syso(78-67)=11
		 */
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };
		int sum = 0, sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		for (int j = 0; j <= 12; j++) {
			sum1 = sum1 + j;

		}
		System.out.println(sum1);
		System.out.println(sum1 - sum);
	}
}
