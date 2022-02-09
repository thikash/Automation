package interviewQA;

public class RemoveJunk {

	public static void main(String[] args) {
String s="$#$@!~%^&*()_ece06787888";
 s.replaceAll("[^a-zA-Z]","");
System.out.println(s);
//Because String is Immutable
s=s.replaceAll("[^a-zA-Z0-9]", "");
System.out.println("String eliminate special character:"+s);
s=s.replaceAll("[^a-zA-Z]", "");
System.out.println("String eliminate special and Number Character:"+s);

	}

}
