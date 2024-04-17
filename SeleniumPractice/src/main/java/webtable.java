import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
		//to find rows in table
		int rows= driver.findElements(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/tbody/tr")).size();
		System.out.println("total no of rows: " + rows);
		// no of columns
		int columns= driver.findElements(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/thead/tr/th")).size();
		System.out.println("total no of rows: " + columns);
		//retrieve the specific row/column data
		String value = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("the value is : " + value);
		//retrieve all data from table
		for(int r=1; r<=rows; r++) {
			for(int c=1; c<=columns;c++) {
				String data = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print( data+"   "); 
				
				
			}
			System.out.println();
			// print particular data on table
			for(int r=1;r<=rows;r++ ) {
				String language = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/tbody/tr["+r+"]/td[1]]")).getText();
				if(language.equals("QTP")) {
					String version = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/table/tbody/tr["+r+"]/td[2]]")).getText();
				System.out.println(language+ " "+ version+"  ");
				}
			}
		}
	    driver.quit();
	}

}
