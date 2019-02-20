import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://classic.crmpro.com/index.html?e=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Nagaraj");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nagaraj@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a")).click();
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//a[text()='Chiru B']//parent::td[@class='datalistrow']//preceding-sibling::"
			+ "td[@class='datalistrow']//input[@name='contact_id']")).click();
	}

}
