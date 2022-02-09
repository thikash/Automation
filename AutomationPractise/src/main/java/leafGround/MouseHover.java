package leafGround;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/mouseOver.html#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement mouse = driver.findElement(By.xpath("//a[@class='btnMouse']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mouse).perform();
		Thread.sleep(5000);
		File src= driver.getScreenshotAs(OutputType.FILE);
		File dst= new File("./snapShot/mouseHover.png");
		FileUtils.copyFile(src, dst);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@href='#']//parent::li"));
		System.out.println(allLinks.size());
		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println("Get all links Text["+i+"]:"+allLinks.get(i).getText());
			
		}
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		
		
		
		Alert alert = driver .switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

		
		
		driver.findElement(By.xpath("//a[text()='RPA']")).click();
		String RPA = alert.getText();
		System.out.println(RPA);
		alert.accept();
		
}
	}


