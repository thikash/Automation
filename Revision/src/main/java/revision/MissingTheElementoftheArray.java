package revision;

public class MissingTheElementoftheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {0, 1,2,3, 5, 6, 7, 8, 9 };
		for (int i = 0; i < num.length; i++) {
			if (num[i] != i) {
				System.out.println("missing element is:" + i);
				break;
			}
		}

	}
}
