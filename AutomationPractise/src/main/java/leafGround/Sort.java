package leafGround;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sort {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://codepen.io/thgreasi/pen/PGRoRY");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='result']"));
driver.switchTo().frame(frame1);

WebElement it1 = driver.findElement(By.xpath("//li[text()[normalize-space()='Item 1']]"));
WebElement it4 = driver.findElement(By.xpath("//li[text()[normalize-space()='Item 4']]"));

Point location = it1.getLocation();
int x = location.getX();
int y = location.getY();
Actions builder = new Actions(driver);
builder.dragAndDropBy(it4, x, y).perform();
}
}
