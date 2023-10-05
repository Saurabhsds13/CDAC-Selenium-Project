package FIFA22;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
// .Context Click.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Right_Click {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor)dr;
	String s = "https://www.amazon.in/";
	dr.get(s);
	dr.manage().window().maximize();
	Thread.sleep(2000);
	WebElement w=dr.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	WebElement s1 =dr.findElement(By.xpath("//a[@id='nav-global-location-popover-link']"));
	WebElement s2=dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	Actions act=new Actions(dr); // Action class-- mouse movement
	String selopt =w.getText();
	System.out.println(selopt);
	 js.executeScript("window.scrollBy(0,5000)");
	 Thread.sleep(3000);
	 dr.findElement(By.xpath("//a[@id='icp-touch-link-language']")).click();	
	act.moveToElement(w);
	act.build().perform();
	Thread.sleep(3000);
	act.contextClick(s1);
	act.build().perform();
	Thread.sleep(3000);
	dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Saurabh");
	act.doubleClick(s2);
	act.build().perform();
	Thread.sleep(3000);
	dr.quit();
	
}
}
