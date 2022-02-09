package interviewQA;

public class IsNumber {
public static boolean isnumber(String number) {
	//without try block exception numberFormatException 
	try {
	Long.parseLong(number);
	System.out.println("given number is valid"+number);
	return true;
	}
	catch(NumberFormatException e) {
		System.out.println("is not a valid number"+number);
	return false;
	}
	 
}
	
	public static boolean isPhoneNumber(String n){
		if(n.length()==10 & isnumber(n)) {
			System.out.println("the number is valid"+n);
			return true;
		}
		else {
			System.out.println("The number is not valid and the number is above 10:"+n);
		return false;
		}
	}
	public static boolean isCCNumber(String no) {
		if(no.length()==16 & isnumber(no)) {
			System.out.println("The CC number is valid"+no);
			return true;
		}
		else {
			System.out.println("CC number is not valid"+no);
			return false;
		}
	}
	

public static void main(String[] args) {
	System.out.println(isnumber("88899922255"));//it is valid number
	System.out.println(isnumber("88efgnms"));//it is not valid number
	System.out.println(isPhoneNumber("8344689525"));
	System.out.println(isPhoneNumber("96548"));
	System.out.println(isPhoneNumber("984200000000"));
System.out.println(isCCNumber("6983937393125894"));
System.out.println(isCCNumber("568714239825014880488210"));
}
}
