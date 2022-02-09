package revision;

public class BasicsString {
	public static void main(String[] args) {
		String a = "aa   thi";
		// Index start on 0,1,2,3,4,5,6,7,8;
		String b = "I'm Aathi";
		
		// String length of b
		int lengthStr = b.length();
		System.out.println("Length of String b is:" + lengthStr);
		
		// String Length of a
		int length = a.length();
		System.out.println("length of String a is:" + length);
		
		// Find the character of 5th position in b
		char charAt = b.charAt(5);
		System.out.println("The position of character 5 is:" + charAt);
		
		// Find the Index of a position in b
		int indexOf = b.indexOf(a);
		System.out.println("Index of character is:" + indexOf);

		int lastIndexOf = b.lastIndexOf("Aathi");
		System.out.println("lastIndexof:" + lastIndexOf);

		// String convert to character
		char[] charArray = b.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("charArray[" + i + "]:" + charArray[i]);
		}
		
		// Eleminate space in String b
		String[] split = b.split(" ");
		for (int j = 0; j < split.length; j++) {
			System.out.println("split the space[" + j + "]:" + split[j]);
		}
		
		//eleminate (') in String b
		String[] split4 = b.split("'");

		for (int i = 0; i < split4.length; i++) {
			System.out.println("split the single quotation(')["+i+"]:"+split4[i]);
		
		}
		String[] split8 = b.split(" ");
		for (int i = 0; i < split8.length; i++) {
			System.out.println("without space:"+split8[i]);

		}
				// eleminate lowercase a in String a
		String[] split2 = a.split("a");

		for (int k = 0; k < split2.length; k++) {
			System.out.println("Split the character a[" + k + "]:" + split2[k]);

		}
		
		// eleminate space in String a
		String[] split3 = a.split("   ");
		for (int i = 0; i < split3.length; i++) {
			System.out.println("Split the space a[" + i + "]:" + split3[i]);
        }
	}

}
