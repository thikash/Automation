package interviewQA;
public class ForEvenNumber {

	public static void main(String[] args) {
		
		for (int i = 0; i <=50; i++) {
			/*if (i%2==0) {
				System.out.println(i+"the number is even number");
				
		}*/
			
			 if(i%2!=0) {
				System.out.println(i+"The number is odd");
			}
			else if(i==0){
					System.out.println(i+"is the number is neutral");
				}
			  else {
			 System.out.println(i+"The number is even");
			}
		}
	}
}
