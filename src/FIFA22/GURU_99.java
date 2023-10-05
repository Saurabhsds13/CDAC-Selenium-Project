package FIFA22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GURU_99 {
public static void main(String[] args) {
	WebDriver dr =new ChromeDriver();
	dr.navigate().to("https://www.demo.guru99.com");
	String s= dr.getTitle();
	System.out.println(s);
	System.out.println(dr.getTitle());
	System.out.println(dr.getCurrentUrl());
//	System.out.println(dr.getPageSource());
//	System.out.println(dr.getWindowHandle());
	String d= dr.getTitle();

	if(s.equals(d)) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	
}
}
