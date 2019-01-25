package Learning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linksCount {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		
		//1. Count of the links available on page
		//2. Count of footer links
		
		WebDriver driver= new FirefoxDriver ();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count of footer links
		WebElement footdriver = driver.findElement(By.id("gf-BIG"));        // limiting webdriver scope
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		
		//count of Footer 1st column link 
		WebElement footercolumndriver = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(footercolumndriver.findElements(By.tagName("a")).size());
		
		//click on each link in the coloumn and check if the pages are opening
		for (int i=1; i<footercolumndriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickonLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			footercolumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			Thread.sleep(5000L);
		}//using this for loop , opens all tabs
		
		String parent=driver.getWindowHandle();
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it= abc.iterator();
		
		while(it.hasNext())
		{
			
			//driver.switchTo().window(it.next());
			//System.out.println(driver.getTitle());
			String child_window=it.next();

			if(!parent.equals(child_window))

			{

			driver.switchTo().window(child_window);

			System.out.println(driver.switchTo().window(child_window).getTitle());

			driver.close();

			}

			}

			driver.switchTo().window(parent);

			System.out.println(driver.switchTo().window(parent).getTitle());
		}
		
		
			
	}


