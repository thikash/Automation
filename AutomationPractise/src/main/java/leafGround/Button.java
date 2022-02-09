package leafGround;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Button.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Go To Home Page
	WebElement cl = driver.findElement(By.id("home"));

cl.click();
String currentUrl = driver.getCurrentUrl();
System.out.println("Home URL is:"+currentUrl);
driver.navigate().back();
String cURL = driver.getCurrentUrl();
System.out.println("Edit page:"+cURL);
String org="http://leafground.com/pages/Button.html";
if(cURL.equals(org)) {
	System.out.println("URL same page is verified!!");
}
else {
	System.out.println("error! page is not verified");
}
//String pageSource = driver.getPageSource();
//System.out.println("Page source is:"+pageSource);
///Get the X Y position
WebElement pos = driver.findElement(By.id("position"));
Point location = pos.getLocation();
System.out.println("The XY position is:"+location);
//Get the background color
WebElement clo = driver.findElement(By.id("color"));
String text = clo.getAttribute("Style");
System.out.println(text);
String cssValue = clo.getCssValue("background-color");
System.out.println("Find button color:"+cssValue);

//Get the size
Dimension size = driver.findElement(By.id("size")).getSize();
System.out.println("Find the height and width"+size);
}
}
