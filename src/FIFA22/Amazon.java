package FIFA22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver dr = new ChromeDriver();
	String s = "https://www.amazon.in/";
	dr.get(s);
	dr.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement w=dr.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Actions act=new Actions(dr); // Action class-- mouse movement
	String selopt =w.getText();
	System.out.println(selopt);
	act.moveToElement(w);
	act.build().perform(); // on mouse over
//	dr.findElement(By.xpath("//span[contains(text(),'Your Orders')]")).click(); // your orders
//	act.click();
	
	} 

}
