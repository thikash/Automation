package leafGround;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement findElement3 = driver.findElement(By.id("yes"));
		boolean selected3 = findElement3.isSelected();
		System.out.println("Yes Radio button:"+selected3);
		WebElement findElement2 = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		boolean selected2 = findElement2.isSelected();
		System.out.println("Unchecked Radio button is:"+selected2);
		WebElement findElement = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		boolean selected = findElement.isSelected();
		
		
		System.out.println("checked Radio Button is:"+selected);
		driver.findElement(By.xpath("//input[@name='age']")).click();
		
	}

}
