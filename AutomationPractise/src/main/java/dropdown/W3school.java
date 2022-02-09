package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3school {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Thread.sleep(3000);
driver.switchTo().frame("iframeResult");

Select d=new Select(driver.findElement(By.name("cars")));

if(d.isMultiple()) {
List <WebElement> w=d.getOptions();
for(WebElement opt:w) {
	d.selectByVisibleText(opt.getText());
	//d.deselectAll();
	
}
System.out.println("it's Select Multiple dropdown");
}
else {
	System.out.println("it's not support multiple drop");
}
//driver.quit();


}
}
