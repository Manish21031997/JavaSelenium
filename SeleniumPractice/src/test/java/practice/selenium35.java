package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium35 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	   WebElement searchfield= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		System.out.println("display: "+ searchfield.isDisplayed());
		System.out.println("display: "+ searchfield.isEnabled());
		System.out.println("display: "+ searchfield.isSelected());
		driver.get("https://www.youtube.com");
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com");
		driver.close();
		
	}

}