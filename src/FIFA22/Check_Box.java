package FIFA22;

//import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Box {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr =new ChromeDriver();
	String s= "https://www.saucedemo.com/";
	dr.get(s);
	WebElement we=dr.findElement(By.xpath("//input[@id='user-name']"));
	
	we.sendKeys("hiii");
	Thread.sleep(3000);
	we.clear();
	we.sendKeys("HEloooo");
	Thread.sleep(3000);
	we.clear();
//	dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//	Thread.sleep(2000);
//	dr.findElement(By.xpath("//input[@id='user-name']")).clear();
//	dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//	Thread.sleep(2000);
//	dr.findElement(By.xpath("//input[@id='user-name']")).clear();
//	
}
}
