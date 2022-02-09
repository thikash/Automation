package interfaces;

public class Execution {
public static void main(String[] args) {
	SBI sb=new SBI();
	sb.AccidentInsu();
	sb.AgriLoan();
	sb.CarLoan();
	sb.Credit();
	sb.EducationLoan();
	sb.HouseLoan();
	sb.insurance();
	sb.Credit();
	sb.mutualFund();
	
	System.out.println(sb.ss);
System.out.println(sb.dd);
System.out.println(sb.min);
System.out.println("*************");	
IOB io=new IOB();
	io.BussinessLoan();
	io.CarLoan();
	io.Credit();
	io.deposit();
	io.EducationLoan();
	io.HouseLoan();
	io.jewelsLoan();
	//SBI s=(SBI) new RBIBANK();
	//RBIBANK rb=new RBIBANK();Cannot instantiate the type RBIBANK
	System.out.println("*************");
	RBIBANK r=new SBI();
	r.CarLoan();
	r.Credit();
	r.deposit();
	r.EducationLoan();
	r.HouseLoan();
	System.out.println("Minium Balance is:"+r.min);
	System.out.println(r.dd);
	System.out.println(r.ss);
	System.out.println(r.min);

	System.out.println("*************");
	suwisBank s=new SBI();
	s.mutualFund();
	
}
}
