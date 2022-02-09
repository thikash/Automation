package leafGround;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("http://leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Enter the emailid
	driver.findElement(By.id("email")).sendKeys("aathiprakash.068@yahoo.com");
	WebElement findElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
	findElement.sendKeys("aathi");
	findElement.sendKeys(Keys.TAB);
	String text = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
	System.out.println(text);
	String t="TestLeaf";
	if(text.equals(t)) {
		System.out.println("Name verified");
	}
	else {
		System.out.println("different Name Error!");
	}
	WebElement f = driver.findElement(By.xpath("(//input[@name='username'])[2]"));
	f.clear();
	boolean displayed = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isDisplayed();
	System.out.println(displayed);
}
}
