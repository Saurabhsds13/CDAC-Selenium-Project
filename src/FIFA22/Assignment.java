package FIFA22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr =new ChromeDriver();
	String s= "https://www.saucedemo.com/";
	dr.get(s);
	dr.manage().window().maximize();
	System.out.println(dr.getTitle());
	System.out.println(dr.getCurrentUrl());
	Thread.sleep(3000);
	dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	dr.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	dr.findElement(By.xpath("//input[@id='login-button']")).click();
	Thread.sleep(2000);
	dr.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	Thread.sleep(3000);
	dr.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
	Thread.sleep(3000);
	dr.findElement(By.xpath("//button[@id='checkout']")).click();
	Thread.sleep(3000);
	dr.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Saurabh");
	Thread.sleep(3000);
	dr.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Sonawane");
	Thread.sleep(3000);
	dr.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("424001");
	Thread.sleep(3000);
	dr.findElement(By.xpath("//input[@id='continue']")).click();
	Thread.sleep(3000);
	dr.findElement(By.xpath("//button[@id='finish']")).click();
	Thread.sleep(4000);

	dr.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	Thread.sleep(4000);
	dr.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	Thread.sleep(4000);
	
	
	dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_use");
	dr.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauc");
	Thread.sleep(2000);
	dr.findElement(By.xpath("//input[@id='login-button']")).click();
	WebElement we= dr.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]"));
	Thread.sleep(3000);
	System.out.println(we.getText());
	Thread.sleep(3000);
	dr.quit();
	
	
}
}
