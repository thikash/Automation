package parameterTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public ChromeDriver driver;
	
	@Parameters({"url", "password", "username"})//order can be anything name should be correct matching
	@BeforeMethod
public void precondition(String url, String pWord, String uName) {//order should be correct name can be anything 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println(driver);
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys(uName);
	driver.findElement(By.id("password")).sendKeys(pWord);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	
	
	}
	
	@AfterMethod
	public void postcondition() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}

}
