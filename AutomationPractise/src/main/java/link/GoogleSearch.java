package link;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
	List<WebElement> sugg = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='pcTkSc']"));
System.out.println(sugg.size());
for (int i = 0; i < sugg.size(); i++) {
	System.out.println(sugg.get(i).getText());
	if(sugg.get(i).getText().contains("selenium testing")) {
		 sugg.get(i).click();
		 break;
	}
}
}
}
