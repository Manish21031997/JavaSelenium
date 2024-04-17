package practice;
     import java.util.ArrayList;
import java.util.List;
import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class windowhandles{
		public static void main(String[]args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
		     driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN826G0&p=facebook+sign+up");
		     Set<String>windowids= driver.getWindowHandles();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[4]/ul[1]/li[1]/a")).click();
		     List<String> windowidslist= new ArrayList<String>(windowids);
		    /*String parentwindowid= windowidslist.get(0);
		    String childwindowid= windowidslist.get(1);
		    System.out.println("parentwindowid: "+ parentwindowid);
		    System.out.println("childwindowid: "+childwindowid);*/
		     for (String winid: windowidslist) {
		    	// System.out.println(winid);
		    	 String title= driver.switchTo().window(winid).getTitle();
		     if(title.equals("facebook sign up - Yahoo India Search Results")){
		     driver.close();
			}
		     }
		}
	}

