import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEbElement {

	public static void main(String[] args, WebDriver ServiceProviderLinks) {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.facbook.com");
		List<WebElement>elementList=(List<WebElement>) driver.findElement(By.xpath("//div[@id='example']//ul//li"));
		int listSize=elementList.size();
		for(int i=0; i<listSize; i++){
			ServiceProviderLinks.getCurrentUrl();
		driver.navigate().back();
		}
	}

}
