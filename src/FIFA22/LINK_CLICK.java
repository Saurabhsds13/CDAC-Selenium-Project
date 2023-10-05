package FIFA22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LINK_CLICK {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver dr =new ChromeDriver();
	String s= "https://www.saucedemo.com/";
	dr.get(s);
	
	dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_use");
	Thread.sleep(2000);
	dr.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauc");
	Thread.sleep(2000);

	dr.findElement(By.xpath("//input[@id='login-button']")).click();
	Thread.sleep(2000);

//	System.out.println(dr.findElement((By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1])"))));
	WebElement we= dr.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]"));
	System.out.println(we.getText());
	
	}
	
}

// web element is an interface using web driver 



