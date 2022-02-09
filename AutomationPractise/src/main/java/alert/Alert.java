package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// Simple Alert
		WebElement alert = driver.findElement(By.xpath("//*[@name='alert']"));
		alert.click();
		String text = driver.switchTo().alert().getText();
		System.out.println("Simple Alert:" + text);
		driver.switchTo().alert().accept();
		
		
		// Confirmation Alert
		driver.findElement(By.xpath("//*[@value='Confirmation Box']")).click();
		String text2 = driver.switchTo().alert().getText();
		System.out.println("Confirmation Alert:" + text2);
		if (text2.equals("I am confirm")) {
			System.out.println(" same text is present");
		} else {
			System.out.println("Opps!");
		}
		driver.switchTo().alert().dismiss();

		// Prompt Alert
		driver.findElement(By.xpath("//*[@value='Prompt']")).click();
		// String text3 = driver.switchTo().alert().getText();
		// System.out.println("Prompt Alert:"+text3);
		driver.switchTo().alert().sendKeys("hello");

		driver.switchTo().alert().accept();
	}

}
