package FIFA22;
import org.openqa.selenium.By;
// Tab Handle Link - https://automationexplore.com/selenium-automation-practice-page/?country=None
// 1> Open DemoQa.com webpage.
// 2> Maximize the webpage.
// 3> Get title and print in cansole.
// 4> compare title with guru99 and print result in casole
// 5> check first name textbox available or not and print result.
// 6> enter data in first name with id locator.
// 7> fetch enter data and load in cansole.
// 8> Enter last name and emailid.
// 9> Select Gender
// 10> check that redio button is selected or not.
// 11> enter mobile number 
// 12> select date of birth
// 13> click on subject enter sub "Data Structure" clear the feild then add Software engineering
// 14> Select Hobbies.
// 15> upload any picture.
// 16> Enter Adress
// 17> Select city from the drop down list 
// 18> Print selected city in the cansole
// 19> click om submit button.
// 20> open new tab -https://automationexplore.com/selenium-automation-practice-page/?country=None
// 21> select drop down menu.
// 22> click here top get alert button.
// 23> capture the alert msg and print in cansole.
// 24> comeback to privious website click on submit button.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ModuleEnd_Exam {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr= new ChromeDriver();
	dr.navigate().to("https://demoqa.com/automation-practice-form");
	Thread.sleep(2000);
	
	dr.manage().window().maximize();
	
	String s =dr.getTitle();
	System.out.println(s);
	
	 System.out.println("-----------------------------------");
	if(s.equals("guru99")) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
    System.out.println("-----------------------------------");
 
	WebElement w= dr.findElement(By.id("firstName"));
	System.out.println(w.isDisplayed());
	
    System.out.println("-----------------------------------");
    Thread.sleep(2000);
    
	String d="Saurabh";
	w.sendKeys(d);
	
//	w.getAttribute(d);
	System.out.println(w.getAttribute("value"));
    System.out.println("-----------------------------------");
	
	dr.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sonawane");
	dr.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Saurabhsds13@gmail.com");
	
	dr.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	
	WebElement t= dr.findElement(By.xpath("//label[contains(text(),'Male')]"));
	System.out.println(t.isSelected());
	
	 System.out.println("-----------------------------------");
	
	dr.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7972227009");
//	dr.findElement(By.xpath("	//input[@id='dateOfBirthInput']")).sendKeys("13 Jan 1997");
	WebElement h= dr.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]"));
	h.sendKeys("Data Structure");
	Thread.sleep(2000);
	h.clear();
//	Thread.sleep(2000);
	h.sendKeys("Software Engineering");
//	Thread.sleep(2000);
	dr.findElement(By.xpath("//label[contains(text(),'Music')]")).click();
	Thread.sleep(2000);
	WebElement addFile = dr.findElement(By.id("uploadPicture"));
	addFile.click();
	addFile.sendKeys("\"C:\\Users\\CDAC\\Downloads\\d9g70ho-92b31169-e756-4be2-a1e3-3d59b97eca57.png\"");
	Thread.sleep(2000);
	dr.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("189, Bahubali Nagar Sakri road,Dhule.424001");
	
	
	Select state = new Select(dr.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]")));
	state.selectByValue("Haryana");
	
	Select city = new Select(dr.findElement(By.xpath("///body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]")));
	city.selectByValue("Panipat");
	
	WebElement cit=dr.findElement(By.xpath("///body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]"));
	System.out.println(cit.getAttribute("value"));
	
	
	dr.findElement(By.xpath("//button[@id='submit']")).click();
	
	
	dr.switchTo().newWindow(WindowType.TAB);
	dr.get("https://automationexplore.com/selenium-automation-practice-page/?country=None");
	
	dr.findElement(By.xpath("//button[@id='alertbutton']")).click();
	
}
}
