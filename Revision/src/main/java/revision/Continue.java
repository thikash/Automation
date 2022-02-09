package revision;

public class Continue {

	public static void main(String[] args) {
		for (int i = 0; i <15; i++) {
			if(i==3) {
				continue;
				//System.out.println("terminate 3 and resume all the iteration are executed");
			}
			else if(i==5) {
				continue;
			}
			else if(i==9) {
				break;
			}
			
		}
	}
}
