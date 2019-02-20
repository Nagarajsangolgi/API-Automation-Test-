import static org.testng.Assert.assertNotEqualsDeep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 
		 long start=System.currentTimeMillis();
		 
		 driver.get("http://www.Bid2Bring.com");

		 long finish= System.currentTimeMillis();
		 long totalTime= finish-start;
		 System.out.println("PageLoad timeOut:"+totalTime);
		 
		 driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/div/div[2]/a")).click(); 
		 driver.findElement(By.id("txtEmailID")).sendKeys("v1@gmail.com");
		 driver.findElement(By.id("txtPassword")).sendKeys("vaayoo");
		 driver.findElement(By.id("btnLogin")).click();
		  
		 driver.findElement(By.id("txtAccountNumber")).sendKeys("0001234567789");
		 driver.findElement(By.id("txtBankName")).sendKeys("Axis Bank");
		 driver.findElement(By.id("txtBankRoutingInfo")).sendKeys("101200453");
		 driver.findElement(By.id("txtSSN")).sendKeys("0453");
		 driver.findElement(By.xpath("//*[@id='txtDOB']")).click();
		 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]")).sendKeys("Jun");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]")).sendKeys("1993");
		 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[7]/a")).click();
		
		 
		  
		 
	}

}
