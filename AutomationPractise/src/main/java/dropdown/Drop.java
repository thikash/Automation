package dropdown;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//1
		WebElement findElement = driver.findElement(By.id("dropdown1"));
		Select drop1 = new Select(findElement);
		drop1.selectByIndex(1);
//2
		WebElement findElement2 = driver.findElement(By.name("dropdown2"));
		Select drop2 = new Select(findElement2);
		drop2.selectByValue("3");
//3 
		WebElement findElement3 = driver.findElement(By.id("dropdown3"));
		Select drop3 = new Select(findElement3);
		drop3.selectByVisibleText("Loadrunner");

//get number of dropDown
		WebElement findElement4 = driver.findElement(By.className("dropdown"));
		Select drop4 = new Select(findElement4);
		drop4.selectByValue("3");
		List<WebElement> drp4 = drop4.getOptions();
		System.out.println(drp4.size());

//Use sendkeys to select
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/..")).sendKeys("Selenium");

//get all DropDown
		Select drop6 = new Select(driver.findElement(By.xpath("//option[text()='Select your programs']/..")));
		List<WebElement> d6 = drop6.getOptions();
		for (int i = 0; i < d6.size(); i++) {
			System.out.println(d6.get(i).getText());
			
			
			// Click All DropDown
			Select drop7 = new Select(driver.findElement(By.xpath("//option[text()='Select your programs']/..")));
			List<WebElement> d7 = drop7.getOptions();
			for (WebElement options : d7) {
				drop7.selectByVisibleText(options.getText());
								
			}
			
			

			
}
			
			

			
			
			
			
}
}

