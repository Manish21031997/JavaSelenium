package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium29 {
	public static void main(String[] args) throws InterruptedException{
		//to handle browsers
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://facebook.com");
		String windowid=driver.getWindowHandle();
		System.out.println(windowid);
	    driver.findElement(By.xpath("//*[@id=\"u_0_2_Q+\"]")).click();
	    Set<String> winid=driver.getWindowHandles();
	    
	    List<String>winidList=new ArrayList(winid);
	    String parent=winidList.get(0);
	    String child=winidList.get(1);
	    System.out.println(parent);
	    System.out.println(child);
	    
	    driver.switchTo().window(parent);
	    System.out.println(driver.getTitle());
	    
	    
	    
	}
	    
	}


