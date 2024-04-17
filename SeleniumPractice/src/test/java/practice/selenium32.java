package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium32 {
	public static void main(String[] args) throws InterruptedException{
		//to handle web Table(rows, columns) 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.selenium.dev/downloads");
		int rows=driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
		System.out.println(rows);
		int cols=driver.findElements(By.xpath("//table[@class='data-list']/thead/tr/th")).size();
		System.out.println(cols);
		String value=driver.findElement(By.xpath("//table[@class='data-list']//tr[2]/td[1]")).getText();
		System.out.println(value);
		
	}

}
