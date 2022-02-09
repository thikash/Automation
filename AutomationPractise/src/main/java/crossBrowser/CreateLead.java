package crossBrowser;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test(dataProvider="sendData")
	public  void createLead (String cmp, String fname, String lname, String phno) {
		System.out.println(driver);
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmp);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(indices= {1, 3})
	public String[][] sendData() throws IOException {
		//String[][] data= ReadXL.readData("CreateLead");
		
		
		return ReadXL.readData("CreateLead");
		
	}
}






