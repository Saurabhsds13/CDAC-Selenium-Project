// How to drag and drop.
package FIFA22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr =new ChromeDriver();
	dr.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Thread.sleep(2000);
	WebElement s1=dr.findElement(By.id("box2")); // Drag element
	WebElement s2=dr.findElement(By.id("box106")); // Drop element
	
	Actions act =new Actions(dr);
	act.dragAndDrop(s1, s2).build().perform();
}
}
