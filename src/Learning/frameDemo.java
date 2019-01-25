package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source= driver.findElement(By.id("draggable")); 
		WebElement target= driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/ul/li[2]/a")).click();
	}

}
