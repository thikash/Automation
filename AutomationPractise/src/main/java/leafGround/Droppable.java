package leafGround;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//ScreenShot take after drag to drop the element
		
		File srcb = driver.getScreenshotAs(OutputType.FILE);
		File desb = new File("./snapShot/dragBeforedrop.png");
		FileUtils.copyFile(srcb, desb);
		
		
		
		Actions bulider = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		bulider.dragAndDrop(drag, drop).release().build().perform();

		//ScreenShot take after drag to drop the element
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snapShot/dragafterdrop.png");
		FileUtils.copyFile(src, des);
	}
}
