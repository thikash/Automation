package leafGround;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	
	/*WebElement it2 = driver.findElement(By.xpath("//li[text()='Item 2']//parent::li"));
	Thread.sleep(2000);
	WebElement it6 = driver.findElement(By.xpath("//li[text()='Item 6']//parent::li"));
	Point location = it6.getLocation();
	int x = location.getX();
	System.out.println("x Location:"+x);
	int y = location.getY();
	System.out.println("y Location:"+y);
		
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(it2, x,y).perform();*/
	
	
	driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement it1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement it6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		Point location = it6.getLocation();
		int x = location.getX();
		int y = location.getY();
		Actions bulider = new Actions(driver);
		bulider.dragAndDropBy(it1, x, y).perform();
		
	}

}
