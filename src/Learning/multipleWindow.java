package Learning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//a[contains(@href,'support.google.com')]")).click();
		System.out.println("Before switching");
		System.out.println(driver.getTitle());
		Set <String> tabIds= driver.getWindowHandles();
		Iterator<String> loop= tabIds.iterator();
		String parentTab= loop.next();
		String childTab= loop.next();
		
		driver.switchTo().window(childTab);
		System.out.println("After switching");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentTab);
		System.out.println("move back to parent tab");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
