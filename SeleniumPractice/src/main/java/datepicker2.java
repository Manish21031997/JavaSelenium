import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).click();
		//month and year selection
		Select month_drp= new Select (driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]")));
		month_drp.selectByVisibleText("Oct");
		Select year_drp= new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]")));
		year_drp.selectByVisibleText("1990");
		//for date selection
		String date= "15";
		List<WebElement> alldates= driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table//td"));
		for(WebElement ele: alldates) {
			String dt= ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
			}
		}
		driver.close();
		
		
		
	
	}
	

}
