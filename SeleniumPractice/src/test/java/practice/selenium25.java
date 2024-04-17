package practice;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium25 {
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	     driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN826G0&p=facebook+sign+up");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[4]/ul[1]/li[1]/a")).click();
	     Set<String> windowids= driver.getWindowHandles();
	    Iterator<String> it=windowids.iterator();
	    String parentid= it.next();
	    String childid= it.next();
	   /* System.out.println("parentwindowid: "+ parentid);
	    System.out.println("childwindowid: "+childid);
	    driver.switchTo().window(parentid);
	    System.out.println("title : " + driver.getTitle());
	    driver.switchTo().window(childid);
	    System.out.println("title : " + driver.getTitle());
	    */
		driver.quit();
		}
}