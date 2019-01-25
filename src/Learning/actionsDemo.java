package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Actions a = new Actions(driver);
		WebElement move= driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();
		a.moveToElement(driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("father's day special").build().perform();
		
	}

}
