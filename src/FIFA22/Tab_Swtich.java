// Tab Handling.
package FIFA22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tab_Swtich {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr1 =new ChromeDriver();
//	String ParWin=dr1.getWindowHandle();
	
	dr1.navigate().to("https://www.google.com");
//	Thread.sleep(10000);
	dr1.switchTo().newWindow(WindowType.TAB);
	String ParWin1=dr1.getWindowHandle();
	dr1.get("https://www.youtube.com");
	dr1.switchTo().newWindow(WindowType.TAB);
	dr1.get("https://www.GitHub.com");
	dr1.switchTo().window(ParWin1);
//	String ParWin1=dr1.getWindowHandle();
//	dr1.switchTo().window(ParWin1);
	dr1.close();
	dr1.quit();
}
}
