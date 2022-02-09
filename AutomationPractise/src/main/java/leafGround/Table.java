package leafGround;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		//verify the check box is click
		WebElement select = driver.findElement(By.xpath("(//input[@type='checkbox']//parent::td/input)[4]"));
		select.click();
		
		if(select.isSelected()) {
			System.out.println("check box is selected");
			
		}
		
		else {
			System.out.println(" check box is unSelected ");
			
		}
		//verify the check box is unclick
		WebElement uncheck = driver.findElement(By.xpath("(//input[@type='checkbox']//parent::td/input)[4]"));
		uncheck.click();
	boolean selected = uncheck.isSelected();
		System.out.println("The check box is unselected:"+selected);
		if(uncheck.isSelected()) {
			System.out.println("check box is selected");
			
		}
		else {
			System.out.println("check box is unSelected");
		}
		//vital task 3 click checkbox
driver.findElement(By.xpath("//input[@type='checkbox']//parent::td//following::input[1]")).click();
//vital task 3 unclick check box
driver.findElement(By.xpath("//input[@type='checkbox']//parent::td//following::input//following::input/following::input")).click();
//vital task 3 click checkbox	
driver.findElement(By.xpath("//input[@type='checkbox']//parent::td//following::input[3]")).click();
	// vital task 3 unclick checkbox
	driver.findElement(By.xpath("//input[@type='checkbox']//parent::td//following::input[1]")).click();
	
	//get the text learn locator
	String attribute = driver.findElement(By.xpath("//td[text()='Learn Locators']")).getText();
	System.out.println(attribute);
	
	//get all the Details
	List<WebElement> details=driver.findElements(By.xpath("//table[@class='display']//tbody//tr"));
	int size = details.size();
	System.out.println("row:"+size);
	for (int i = 0; i <size; i++) {
		System.out.println(details.get(i).getText());
		
	}
	//get the lst Row selenium, vital, mentor......
	List<WebElement> row1=driver.findElements(By.xpath("//table[@class='display']//tbody//tr[1]"));
	int row1Size = row1.size();
	System.out.println("Row1Size:"+size);
	for (int i = 0; i <row1Size; i++) {
		System.out.println(row1.get(i).getText());
			
		}
		
	//vital Task
	List<WebElement> findElements = driver.findElements(By.xpath("//input[@name='vital']"));
	System.out.println("Size of vital Task is:"+findElements.size());
	for (int i = 0; i < findElements.size(); i++) {
		findElements.get(i).click();
	}
		
		//Mentor Name
		List<WebElement> mn = driver.findElements(By.xpath("//table[contains(@id,'table_id')]//tr//td[5]"));
		System.out.println("size of Mentor Name is:"+mn.size());
		for (int j = 0; j < mn.size(); j++) {
			System.out.println(mn.get(j).getText());
			
		}
		
		
		
		
		
	}
}
	


