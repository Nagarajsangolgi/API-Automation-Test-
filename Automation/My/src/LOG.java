import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LOG {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 
		 long start=System.currentTimeMillis();
		 
		 driver.get("http://www.Bid2Bring.com");

//		 long finish= System.currentTimeMillis();
//		 long totalTime= finish-start;
//		 System.out.println("PageLoad timeOut:"+totalTime);
		 
		 driver.findElement(By.id("divRegister")).click(); 
		 
		 driver.findElement(By.id("txtFirstName")).sendKeys("Bid2Bring");
		 driver.findElement(By.id("txtLastName")).sendKeys("Vaayoo");
		 driver.findElement(By.id("txtCountryCode")).click();
		 
		 Select select= new Select(driver.findElement(By.id("txtCountryCode")));
		 select.selectByIndex(2);
		 driver.findElement(By.id("txtPhoneNumber")).sendKeys("9225647788");
		 driver.findElement(By.id("txtEmailID")).sendKeys("v1@gmail.com");
		 driver.findElement(By.id("txtConfirmEmailID")).sendKeys("v1@gmail.com");
		 driver.findElement(By.id("txtPassword")).sendKeys("vaayoo");
		 driver.findElement(By.id("txtConfirmPassword")).sendKeys("vaayoo");
		 driver.findElement(By.id("txtLicenseNumber")).sendKeys("2013654");
		 driver.findElement(By.id("ddlVehicleType")).click();
		 
		 Thread.sleep(3000);
		 

		 Select select1= new Select(driver.findElement(By.id("ddlVehicleType")));
		 select1.selectByIndex(3);
		 
		 driver.findElement(By.xpath("/html/body/form/div/div[3]/div/div[2]/label")).click();
		 Thread.sleep(2000);
		 StringSelection ss= new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");	
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		//imitate mouse events like ENTER, CTRL+C, CTRL+V
		 Robot robot= new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 driver.findElement(By.xpath("//*[@id='divSubmit']/input[2]")).click();
		 
		 
		 long finish= System.currentTimeMillis();
		 long totalTime= finish-start;
		 System.out.println("PageLoad timeOut:"+totalTime);
		 
		// driver.close();
	}

}
