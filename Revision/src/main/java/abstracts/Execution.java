package abstracts;

public class Execution {
public static void main(String[] args) {
	//RBI r=new RBI(); Cannot instantiate the type RBI
	System.out.println("Static Variable double:"+RBI.s);
	
	System.out.println("SBI Bank");
	SBI s=new SBI();
	s.AgriLoan();
	s.loan();
	s.credit();
	s.depit();
	s.EducationLoan();
	s.saving();
	s.chequebook();
System.out.println("final variable s:"+s);// the output is final variable s:abstracts.SBI@3830f1c0

	System.out.println("Axis Bank");
	AxisBank a=new AxisBank();
	a.commercialLoan();
	a.IndustrialLoan();
	a.loan();
	a.credit();
	a.depit();
	a.saving();
	a.chequebook();
	System.out.println("final variable s:"+s);//final variable s:abstracts.SBI@3830f1c0

	
	System.out.println(" RBI to SBI to get the method of RBI parent class ");
	RBI r=new SBI();
	r.credit();
	r.depit();
	r.loan();
	System.out.println(r.i);
	System.out.println(r.s);
	System.out.println(r.d);
	r.saving();
	r.chequebook();
	
	System.out.println("RBI to Axis to get the method of RBI parent class");
	RBI ra=new AxisBank();
	ra.credit();
	ra.depit();
	ra.loan();
	System.out.println(ra.i);
	System.out.println(ra.s);
	System.out.println(ra.d);
	
	//AxisBank ar=(AxisBank) new RBI();//Cannot instantiate the type RBI
	
}
}
