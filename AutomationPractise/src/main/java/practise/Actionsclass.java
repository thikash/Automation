package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsclass {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//menu
		WebElement menu = driver.findElement(By.xpath("//a[@class='menulink']"));
	System.out.println(driver.getTitle());
		Actions builder = new Actions(driver);
	builder.moveToElement(menu).perform();
	
	//submenu Articles
	driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.navigate().back();
	
	//menu
	WebElement menu1 = driver.findElement(By.xpath("//a[@class='menulink']"));
	Actions builder1 = new Actions(driver);
	builder1.moveToElement(menu1).perform();
	
	//SubMenu SingleVideos
	driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Single Videos']")).click();
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.navigate().back();
	
	
	
	}

}
