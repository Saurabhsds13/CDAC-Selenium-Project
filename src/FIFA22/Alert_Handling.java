package FIFA22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Alert Handling in selenium :-

public class Alert_Handling {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr =new ChromeDriver();
	String s= "https://www.demo.guru99.com/V4/index.php";
	dr.get(s);
	Thread.sleep(2000);
	dr.manage().window().maximize();
	Thread.sleep(2000);
	dr.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
	Thread.sleep(4000);
	dr.switchTo().alert().getText();
	Alert al=dr.switchTo().alert();
	System.out.println(al.getText());
	System.out.println(dr.switchTo().alert().getText()); //------Second way // Alert box massage in cansole.
//	dr.switchTo().alert().sendKeys("Hello Winter");
	dr.switchTo( ).alert( ).accept(); //  To OK the Alert Box
//	dr.switchTo( ).alert( ).dismiss();    To CANCEL the alert box. 

}
}
