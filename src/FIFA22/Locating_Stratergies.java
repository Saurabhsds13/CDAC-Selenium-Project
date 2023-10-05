// => Xpath,Id,Name,Partial linktest,linktest.
// FOR CLICK ON LINKS:- Linktest and partial Linktest apply only on links only.

package FIFA22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locating_Stratergies {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr =new ChromeDriver();
		dr.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		dr.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		dr.findElement(By.name("password")).sendKeys("admin123"); // inspect the element and add name to by name.
		Thread.sleep(2000);
//		dr.findElement(By.tagName("button")).click(); // By tag name.
//		dr.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]")).click(); 
		Thread.sleep(2000);
//		dr.findElement(By.linkText("OrangeHRM, Inc")).click(); // if id and name not available then use linktTest for click on link. use exact name only.
		Thread.sleep(2000);
		dr.findElement(By.partialLinkText("OrangeHRM")).click(); // we can pass half name also not exact name. 
		//Q. Diff Between Partial link text and link text.
		//Q.Tab HAndling
		//Q. Diff between relative xPath and Absolute xPath.
		Thread.sleep(2000);
	}
}
