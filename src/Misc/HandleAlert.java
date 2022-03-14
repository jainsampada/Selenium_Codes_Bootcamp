package Misc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	WebDriver driver;
public void Launch() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "E:\\Sampada\\Bootcamp\\com.OrangeHRM.POM\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.findElement(By.name("proceed")).click();
	Alert alt=driver.switchTo().alert();
	Thread.sleep(5000);
	System.out.println(alt.getText());
	alt.accept();
	
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HandleAlert oo=new HandleAlert();
		oo.Launch();
	}

}
