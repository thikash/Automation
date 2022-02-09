package leafGround;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement frame1 = driver.findElement(By.xpath("(//div[@id='wrapframe'])[1]//iframe"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		WebElement clk1 = driver.findElement(By.id("Click"));
		System.out.println("Before click text:" + clk1.getText());
		clk1.click();
		System.out.println("After click Text:" + clk1.getText());
		driver.switchTo().defaultContent();

		WebElement frame2 = driver.findElement(By.xpath("(//div[@id='wrapframe'])[2]/iframe"));
		driver.switchTo().frame(frame2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();

		WebElement frame3 = driver.findElement(By.xpath("(//div[@id='wrapframe'])[3]//iframe"));
		driver.switchTo().frame(frame3);
		driver.switchTo().defaultContent();
		// Total number of frame
		List<WebElement> sizeofFrame = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frame is:" + sizeofFrame.size());

	}

}
