package leafGround;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectabel {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions builder = new Actions(driver);
		WebElement it3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement it7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
	builder.clickAndHold(it3).moveToElement(it7).perform();
	}

}
