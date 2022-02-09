package dropdown;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dd {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#Select%20Country");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//li[@id='Select Country']/following::Select"));
	Select s=new Select(element);
	List <WebElement> a=s.getOptions();
	
	for(WebElement opt:a) {
	s.selectByVisibleText(opt.getText());
	 
	
	}
	for (int i = 0; i < a.size();i++) {
	System.out.println(a.get(i).getText());

	
		
}
	System.out.println(s.getOptions().size());
	}
}
	
	


