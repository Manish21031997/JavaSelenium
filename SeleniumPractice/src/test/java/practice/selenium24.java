package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium24 {
	public static void main(String[] args) throws InterruptedException{
		//find element, find elements
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demo.nopcommerce.com/");
        WebElement ele=driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
        System.out.println(ele.getText());
        List<WebElement>links=driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
        System.out.println(links.size());
        
        for(WebElement eles:links)
        {
        	System.out.println(eles.getText());
        	
        }
        driver.close();
	}
}
