package FIFA22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SKY_117 {

	private static JavascriptExecutor driver;

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.navigate().to("https://www.javatpoint.com/selenium-webdriver-handling-drop-downs");

		 JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 4500)");  
		((By) driver).findElement((SearchContext) By.cssSelector("link")).click();
	}
}
