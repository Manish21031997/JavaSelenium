import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class downloadfile {
	public static void main(String[] args){
		//chromebrowser settings
		String location= System.getProperty("user.dir")+"\\downloads\\";
		HashMap<String, Object>preferences= new HashMap<>();
		preferences.put("download.default_directory", location);
		
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a")).click();
		
	}

}
