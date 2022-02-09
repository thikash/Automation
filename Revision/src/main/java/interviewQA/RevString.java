package interviewQA;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String b="Selenium Automation Testing";

    int strLen=b.length();
    String rev="";
    
    System.out.println("Input String is:"+b);
    System.out.println("Length of String is:"+strLen);
    for (int i = strLen-1; i >=0; i--) {
    	rev=rev+b.charAt(i);
		
	}
    System.out.println("The Reverse String is:"+rev);
	
	//2.String Buffer
    StringBuffer s=new StringBuffer(b);
    
    System.out.println("The Reverse String is:"+s.reverse());
	}

}
