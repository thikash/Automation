package link;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OverAllLink {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com/");
	//driver.get("https://www.youtube.com/watch?v=6RaDZhfXHI8");
	driver.get("https://www.typingtest.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	List<WebElement> linkFb = driver.findElements(By.tagName("a"));
	int size = linkFb.size();
	System.out.println("Link size are:"+size);
	for (int i = 0; i < size; i++) {
		System.out.println(linkFb.get(i).getText());
		
	}
}
}
