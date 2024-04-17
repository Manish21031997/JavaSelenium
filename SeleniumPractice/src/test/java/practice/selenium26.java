package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium26 {
	public static void main(String[] args) throws InterruptedException{
		//clear, sendkeys, capture text
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement drpcountryele=driver.findElement(By.id("input-country"));
        Select drpCountry=new Select(drpcountryele);
        drpCountry.selectByVisibleText("Denmark");
        drpCountry.selectByValue("1");
        drpCountry.deselectByIndex(1);
        
        //without using methods
        List<WebElement> alloptions=drpCountry.getOptions();
        
        for(WebElement option:alloptions)
        {
        	if(option.getText().equals("india"));
        	{
        		option.click();
        		break;
        	}
        }
	}
       
}
	
