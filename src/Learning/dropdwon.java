package Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropdwon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/Chromedriver.exe");
		
//		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
//		WebDriver dr = new ChromeDriver();
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.xpath(".//a[@value='GOI']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("(.//a[@value='DEL'])[2]")).click();
		
		// If you want to accees any methods in class ,create object for that class and access methods

		//using object.method
		//driver.findElement(By.className("ui-datepicker-trigger")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[3]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();


		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		
		
	}

}
