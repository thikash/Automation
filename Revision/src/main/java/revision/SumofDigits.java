package revision;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4987;
int quotient=1, remainder=0, sum=0,s;
while(quotient>0) {
	
quotient=n/10;
remainder=n%10;
n=quotient;
sum=remainder+sum;


	}
System.out.println(sum+"\tis the number of sum of digit");
	}
}
