package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium30 {
	public static void main(String[] args) throws InterruptedException{
		//to handle links
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);clickCategory(driver, null);
		driver.get("https://www.amazon.in");
		clickCategory(driver, "Electronics");
		verifyCategoryPage(driver, "electronics");
	}
	 private static void clickCategory(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}
	private static void verifyCategoryPage(WebDriver driver, String expectedCategory) {
	        // Get the current page URL
	        String currentUrl = driver.getCurrentUrl();

	        // Check if the expected category is present in the URL
	        if (currentUrl.toLowerCase().contains(expectedCategory.toLowerCase())) {
	            System.out.println("The resulting page corresponds to the clicked category.");
	        } else {
	            System.out.println("The resulting page does not correspond to the clicked category.");
	        }
	    }
	}
		
		
		
		/*driver.findElement(By.linkText("Today's Deals")).click();
		driver.findElement(By.partialLinkText("Deals")).click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		
		for(int i=0;i<=links.size();i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));			
			
		}
		
		
		
		
	}
}*/
