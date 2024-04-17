package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium28 {
	public static void main(String[] args) throws InterruptedException{
		//selecting check boxes
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demoqa.com/checkbox");
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]")).click();
		List<WebElement>check=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println(check.size());
		
		for(int i=0;i<check.size();i++)
		{
			check.get(i).click();
		}
			
	}

}
