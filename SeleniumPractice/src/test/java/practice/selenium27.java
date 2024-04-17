package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium27 {
	public static void main(String[] args) throws InterruptedException{
		//handling drop down
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("/html/body/div/header/div/nav/ul/li[2]/a")).click();
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"services\"]/div/div[1]/div/div[1]/div/div/div/div[1]/div[1]"));
		Select dropdown=new Select(drop);
		List<WebElement> options=dropdown.getOptions();
		
		 ArrayList originallist=new  ArrayList();
		 ArrayList templist=new  ArrayList();
		
		for(WebElement option:options)
		{
			originallist.add(option.getText());
			templist.add(option.getText());
		}
		
	
		//Collections.sort(templist);
		
		
	}

}
