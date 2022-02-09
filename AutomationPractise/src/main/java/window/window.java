package window;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.java2d.opengl.WGLSurfaceData.WGLVSyncOffScreenSurfaceData;

public class window {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='home']")).click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();

		String next = it.next();
		System.out.println("Parent window id" + next);
		Thread.sleep(3000);

		String next2 = it.next();
		System.out.println("Child Class Window id" + next2);

		driver.switchTo().window(next2);
		Thread.sleep(2000);
		System.out.println("Child window Title:" + driver.getTitle());
	
		driver.close();

		driver.switchTo().window(next);
		Thread.sleep(3000);
		System.out.println("Parent window Title:" + driver.getTitle());
		
driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
Set<String> w=driver.getWindowHandles();
Iterator<String> ts=w.iterator();
System.out.println("Total size of the window:"+w.size());
//parent window
String next5 = ts.next();
System.out.println("parent window id"+next5);
	
   //first window 
    String next3 = ts.next();
	System.out.println("first window:"+next3);
	driver.switchTo().window(next3);
	System.out.println("child class window one:"+driver.getTitle());
	driver.close();
	
	//Second window
	String next4 = ts.next();
	System.out.println("second window:"+next4);
	driver.switchTo().window(next4);
	System.out.println("second child class window Title:"+driver.getTitle());
	driver.close();
	//parent window 
	driver.switchTo().window(next5);
	System.out.println("Parent Window Title:"+driver.getTitle());
	Thread.sleep(3000);
	driver.close();
	}
}
