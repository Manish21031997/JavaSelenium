package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlelinks {
	public static void main(String[]args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Today's Deals")).click();
        List<WebElement> tags= driver.findElements(By.tagName("a"));
        //System.out.println("no of  links present: " +tags.size());
        /*for(int i=0; i<=tags.size(); i++) // for loop
        {
			System.out.println(tags.get(i).getText()); // get just names 
        	System.out.println(tags.get(i).getAttribute("href"));//get actual links
        }*/
        int brokenLinks=0;
        for(WebElement tag: tags) { // for each loop
        	//System.out.println(tag.getText());
        	//System.out.println(tag.getAttribute("href"));
        	String url= tag.getAttribute("href");
        	if(url== null || url.isEmpty()) {
        		System.out.println("url is empty");
        		continue;
        		}
        	URL link = new URL(url);
			try {
				HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
			    httpconn.connect();
			    if(httpconn.getResponseCode()>=400) {
			    	System.out.println(httpconn.getResponseCode()+url+"  is"+" Broken link");
			    	brokenLinks++;
			    }
			    else {
			    	System.out.println(httpconn.getResponseCode()+url+ "is "+" valid link");
			    }
			} catch (Exception e) {
				
			}
        	
        }
        System.out.println("Number of broken links: "+brokenLinks);
        driver.quit();
        
        }
        
}