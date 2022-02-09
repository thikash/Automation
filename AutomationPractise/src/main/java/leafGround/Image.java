package leafGround;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement img = driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img"));
	
img.click();
String title = driver.getTitle();
System.out.println("LeafGround Home page Title is:"+title);
driver.navigate().back();

String attribute = driver.findElement(By.xpath("//img[@src=\"../images/abcd.jpg\"]")).getAttribute("src");
System.out.println("The broken link is:"+attribute);
	
driver.findElement(By.xpath("//img[@src=\"../images/keyboard.png\"]")).click();
	
	}
}
