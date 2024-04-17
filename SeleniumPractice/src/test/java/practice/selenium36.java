package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium36 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		List<WebElement>links= driver.findElements(By.xpath("//*[@id=\"APjFqb\"]"))
		System.out.println("" +links.size());
		for(WebElement ele: links) {
			System.out.println(ele.getText());
	
		}
		driver.close();
		
	}

}
