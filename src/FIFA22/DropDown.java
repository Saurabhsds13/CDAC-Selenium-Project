package FIFA22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
//		JavascriptExecutor js = (JavascriptExecutor) dr; 

		String s = "https://en-gb.facebook.com/r.php?locale=en_GB";
		dr.get(s);
		dr.manage().window().maximize();
//		dr.navigate().to("https://en-gb.facebook.com/");
//		Select date = new Select(dr.findElement(By.xpath("//select[@id='day']")));
//		date.selectByValue("13");
		Select month = new Select(dr.findElement(By.xpath("//select[@id='month']")));
		month.selectByIndex(5);
		WebElement we=dr.findElement(By.xpath("//select[@id='month']"));
//		System.out.println(we.getText());
		
//		Select year = new Select(dr.findElement(By.xpath("//select[@id='year']")));
//year.selectByIndex(5);
//		we.getAttribute("value");
		System.out.println(we.getAttribute("value"));
		
//	((WebElement) sr).click();
//		sr.selectByVisibleText("Books");
		  // js.executeScript(Script,Arguments);
//		   js.executeScript("window.scrollBy(0,500)");
			
	}
}
