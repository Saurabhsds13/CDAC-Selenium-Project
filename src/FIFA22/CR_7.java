package FIFA22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CR_7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium deiver\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver dr =new ChromeDriver() ;
		dr.get("https://www.youtube.com");  //get command wait for loading complete web page.
		dr.navigate().to("https://www.facebook.com");
//		Thread.sleep(5000);
		dr.navigate().back();
//		dr.navigate().refresh();
//		Thread.sleep(5000);
		
		dr.navigate().getClass();
		dr.navigate().to("https://www.myntra.com/");
//		dr.navigate().back();
//		dr.navigate().forward();
//		Thread.sleep(5000);
//		dr.navigate().notify();
//		dr.navigate().notifyAll();

		
			dr.navigate().to("https://www.demo.guru99.com/V4/");
			dr.manage().window().maximize();
//			dr.manage().window().minimize();
//			dr.close();
			
			
	}

}