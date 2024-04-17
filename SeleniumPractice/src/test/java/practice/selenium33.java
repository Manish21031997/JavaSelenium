package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium33 {
	public static void main(String[] args) throws InterruptedException{
		//to handle web Table(rows, columns) 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://swisnl.github.io");
		WebElement button=driver.findElement(By.xpath("//span[@class='comtext'))
	}

}
