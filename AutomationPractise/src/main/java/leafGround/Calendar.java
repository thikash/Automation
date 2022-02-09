package leafGround;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {
public static void main(String[] args) {
	//System.getProperty("webdriver.chrome.driver", "C:/Users/GOD/Downloads/chromedriver/chromedriver");
	//WebDriver driver=new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://leafground.com/pages/Calendar.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("datepicker")).click();
	new WebDriverWait(driver,Duration.ofSeconds(10))
	.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
	
	
	WebElement date = driver.findElement(By.id("datepicker"));
	date.click();
	date.sendKeys("22/12/2021");
	String dateVal = "22/12/2021";
	SelectDateJs(driver, date, dateVal);
	
	
}
public static void SelectDateJs(WebDriver driver, WebElement element, String dateVal ) {
	JavascriptExecutor js =((JavascriptExecutor)driver);
	js.executeScript("argument[0].setAttribute('value','"+dateVal+"');", element);
}
}
