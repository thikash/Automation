package revision;

public class CallByRefernceandCallByValue {

	int p;//global variable
	int q;
	
	 public int sum(int i, int j) {
		 
		 int z=i+j;
		 return z;
	 }
	 //callbyrefernce
	 public void swap(CallByRefernceandCallByValue t) {
		 int temp;
		 temp=t.p;
		 t.p=t.q;
		 t.q=temp;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CallByRefernceandCallByValue rv=new CallByRefernceandCallByValue();
System.out.println("SumMethod:"+rv.sum(85,75));
int x=10;
int y=20;
System.out.println("callbyvalue:"+rv.sum(x, y));//call by value or passby value
rv.p=66;
rv.q=85;
rv.swap(rv);
//System.out.println(q);
System.out.println("After Swap P value is:"+rv.p);
System.out.println("After Swap q value is:"+rv.q);
	}

}
