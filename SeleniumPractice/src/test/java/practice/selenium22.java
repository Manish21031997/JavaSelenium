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

public class selenium22 {
	public static void main(String[] args)throws InterruptedException{
		//get title,current Url,page source
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php");
	WebElement element= driver.findElement(By.xpath("//*[@id=\"month\"]"));
	Select drop= new Select (element);
	List<WebElement> options= drop.getOptions();
	ArrayList<String>originallist= new ArrayList();
	Arraylist <templist>= new ArrayList();
	for(WebElement option: options) {
		originallist.add(option.getText());
		templist.add(option.getText());
	}
	System.out.println(originallist);
	System.out.println(templist);
	Collections.sort(templist);
	System.out.println(originallist);
	System.out.println(templist);
	if(originallist.equals(templist)) {
		System.out.println("sorted");
	}
	else {
		System.out.println("Not sorted");
	}
	driver.close();
	}

	
	
	
	
	
	
	
	
	}

}
