package leafGround;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/checkbox.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	boolean selected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
	System.out.println("is Selected:"+selected);
	
	
	WebElement findElement = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[1]/input[1]"));
	if(findElement.isSelected()) {
		findElement.click();
	}
	 
		WebElement findElement2 = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[2]/input[1]"));
	if(findElement2.isSelected()) {
		findElement2.click();
	}
		
	
	
	List<WebElement> allcheck=driver.findElements(By.xpath("//*[@id=\"contentblock\"]/section/div[4]//input"));
	int size = allcheck.size();
	System.out.println("checkBox size:"+size);
	
	for (int i = 0; i < size; i++) {
		allcheck.get(i).click();
		
	}
	
}
}
