package leafGround;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/upload.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@name='filename']")).sendKeys("C:/Users/GOD/Downloads/AATHI_Fresher_Selenium JAVA.pdf");
	
	File src=driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./snapShot/upload.png");
	FileUtils.copyFile(src, dest);
}
}
