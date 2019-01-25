package Learning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new FirefoxDriver ();

		driver.get("https://accounts.google.com/signin");

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/content/div/div/div/div/a/content/span")).click();

		String parent=driver.getWindowHandle();

		Set<String>s1=driver.getWindowHandles();

		Iterator<String> I1= s1.iterator();

		while(I1.hasNext())

		{

		String child_window=I1.next();

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

