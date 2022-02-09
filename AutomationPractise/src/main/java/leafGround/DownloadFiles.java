package leafGround;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFiles {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leafground.com/pages/download.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//download xcel file
	WebElement findElement = driver.findElement(By.linkText("Download Excel"));
	findElement.click();
	
	//download pdf file
	driver.findElement(By.linkText("Download PDF")).click();
	driver.navigate().back();
	//Set<String> window=driver.getWindowHandles();
	//System.out.println(window);
	
	//download text file and get text
	driver.findElement(By.linkText("Download Text")).click();
String text = driver.findElement(By.xpath("//pre[contains(text(),'You have downloaded the file.')]")).getText();
System.out.println("Text File:"+text);
	
}
}
