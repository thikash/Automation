package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

	public static void main(String[] args) {
		//Set up the Chrome Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		//Maximize the window
		driver.manage().window().maximize();
//Wait the element is not (DOM) Document object model
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.findElement(By.id("mail")).sendKeys("6379685788");
org.openqa.selenium.NoSuchElementException: Cannot locate an element using 
		id=mail
		For documentation on this error
		
		driver.findElement(By.id("email")).sendKeys("6379685788");
		driver.findElement(By.name("pass")).sendKeys("ragul1411");
		driver.findElement(By.name("login")).click();*/
		
		//Instagram
		driver.findElement(By.name("username")).sendKeys("thi__kash");
		driver.findElement(By.name("password")).sendKeys("ragul1411");
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
		String title = driver.getTitle();
		System.out.println("Instagram title is:"+title);
		if(title.equals("Login • Instagram")) {
			System.out.println("WEbPage is correctly landed");
		}
		else{
			System.out.println("OPPS!");
		}
		driver.findElement(By.xpath("//*[text()='Not Now']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		String title3 = driver.getTitle();
		System.out.println(title3);
		
	//driver.close();
	}
}
