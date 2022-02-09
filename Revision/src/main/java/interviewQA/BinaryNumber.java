package interviewQA;

public class BinaryNumber {
	//1.Method loop and condition
	public static void isBinaryNumber(int number) {
		boolean isBinary = true;
		int copyNumber = number;
		while(copyNumber!=0) {
			int rem=copyNumber%10;
			if(rem>1) {
				isBinary=false;
				break;
			}
			else {
				copyNumber=copyNumber/10;
			}
		}
		if(isBinary) {
			System.out.println(number+"is a binary number");
			
		}
		else {
			System.out.println(number+"is not a binary number");
		}
	}
public static void isBin(int num) {
	//2.Method condition
	if(String.valueOf(num).matches("[0-1]+")) {
		System.out.println(num+"is a binary number");
	}
	else {
		System.out.println(num+"is a binary number");
	}
	}
public static void isBinum(int n) {
	//3.Method exception handling
	try {
		Integer.parseInt(String.valueOf(n),2);
		System.out.println(n+"is a binary number");
	}
	catch(Exception e) {
		System.out.println(n+"is not a binary number");
	}
}
public static void main(String[] args) {
	isBinaryNumber(1011);
	isBinaryNumber(5102);
	isBinaryNumber(01);
	isBinaryNumber(23);
	isBinaryNumber(1);
	isBinaryNumber(0);
	System.out.println("************************");
	isBinum(0001);
	isBinum(10102);
	isBinum(23065);
	isBinum(1111);
	isBinum(10000);
	System.out.println("**************************");
	isBin(1100);
	isBin(000001);
	isBin(2046);
	isBin(4444);
}
}

