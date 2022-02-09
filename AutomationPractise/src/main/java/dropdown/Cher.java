package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cher {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Select s=new Select(driver.findElement(By.xpath("//select[@id='first']")));
	s.selectByIndex(2);
	s.selectByIndex(0);
	List <WebElement> b=s.getOptions();
	for (int i = 0; i < b.size(); i++) {
		System.out.println(b.get(i).getText());
		
	}
Select n=new Select(driver.findElement(By.xpath("//select[@id='animals']")));
n.selectByValue("avatar");

//driver.findElement(By.xpath("//ul[@class='dropdown-menu show']")).sendKeys("li");

Select v=new Select(driver.findElement(By.xpath("//Select[@id='second']")));
List <WebElement> z=v.getOptions();
for(WebElement opt:z) {
	v.selectByVisibleText(opt.getText());
}
}
}
