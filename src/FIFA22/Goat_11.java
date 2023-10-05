package FIFA22;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goat_11 {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr =new ChromeDriver();
	WebDriver cr =new ChromeDriver();
	dr.get("https://www.youtube.com");
//	dr.switchTo().newWindow(WindowType.TAB);
	
//	Thread.sleep(2000);
//	dr.switchTo().newWindow(WindowType.WINDOW);
//	dr.manage().window().maximize();
//	dr.navigate().to("https://www.myntra.com/");
	cr.navigate().to("https://www.myntra.com");
	dr.close();
}
}
