// Create your own xPath => " //input[@Tagname='value'] ".
// From one xPath to another xPath :-  {//input[@name='username']//following::input}, {//input[@name='password']//following::button}.
// Preceding means pahile cha element select karto and following next elemnent select karto :- //input[@name='email']//preceding::input
package FIFA22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Absolute_xPath {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr = new ChromeDriver();
	dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
    //dr.findElement(By.xpath("//input[@name='password']")).click();  // use input for input and button for button
	dr.findElement(By.xpath("//button[@type='submit']")).click();  // here we use //button for button tag
	
}
}

