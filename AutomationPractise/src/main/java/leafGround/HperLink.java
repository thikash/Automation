package leafGround;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.navigate().to("http://leafground.com/pages/Link.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
driver.navigate().back();


WebElement li = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"));
	String attribute = li.getAttribute("href");
	System.out.println("Find where am supposed to go without clicking me:"+attribute);
	
	
	WebElement broke = driver.findElement(By.xpath("//a[@href='error.html']"));
	broke.click();
	String title = driver.getTitle();
	System.out.println("Title:"+title);
	String orgtitle="HTTP Status 404 – Not Found";
	
	if(title.equals(orgtitle)) {
		System.out.println("page is broken");
	}
	else {
		System.out.println("page is not broken");
			
		}
	driver.navigate().back();
	driver.findElement(By.linkText("Go to Home Page")).click();

	driver.navigate().back();
	
	//List<WebElement> allLinks=driver.findElements(By.xpath("//a[@href='#']"));
	
	//System.out.println("Total number of links:"+allLinks.size());
	List<WebElement> linkcount1 =driver.findElementsByTagName("a");
	System.out.println("The number of links are " +linkcount1.size());

	}
	
	}


