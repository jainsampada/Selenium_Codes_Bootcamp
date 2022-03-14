package Misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	WebDriver driver;
public void acc()
{
	System.setProperty("webdriver.chrome.driver", "E:\\Sampada\\Bootcamp\\com.OrangeHRM.POM\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	Actions action=new Actions(driver);
	action.clickAndHold(driver.findElement(By.id("draggable")))
	.moveToElement(driver.findElement(By.id("droppable")))
	.release().build().perform();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragDrop oo=new DragDrop();
		oo.acc();
	}

}
