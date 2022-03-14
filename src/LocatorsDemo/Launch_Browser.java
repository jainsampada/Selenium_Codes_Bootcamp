package LocatorsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launch_Browser {
	WebDriver driver;
	String path;
	String text;
	WebElement uname;
	public void launch() throws InterruptedException {

		// Step -1
		System.setProperty("webdriver.chrome.driver", "E:\\Sampada\\Drivers\\chromedriver_win32\\chromedriver.exe");

		// Step-2
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Step 3 - Open Application
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//Step 4 - Locate Element By Id
		uname=wait.until(ExpectedConditions.elementToBeClickable(By.id("txtUsername")));
		uname.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
//		text=driver.findElement(By.id("spanMessage")).getText();
//		System.out.println("You entered wrong credentials:"+text);
//		System.out.println(driver.getTitle());
		//driver.findElement(By.linkText("Forgot your password?")).click();
	//	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[5]/input[1]")).click();
	//	driver.findElement(By.xpath("//input[@class='button']")).click();
	//	driver.navigate().back();
	//	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		//Thread.sleep(5000);//Static wait
		//driver.close();
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Launch_Browser oo = new Launch_Browser();
		oo.launch();
	}

}
