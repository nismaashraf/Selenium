package my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class New {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
 WebDriver driver= new ChromeDriver();
	SoftAssert softAssert = new SoftAssert();

	driver.get("https://www.orangehrm.com/");
	String Nit="HRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM";
	String T=driver.getTitle();
	System.out.println("this"+T);

	softAssert.assertEquals(Nit, T, "fails");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input[type='email']")).click();
	driver.findElement(By.cssSelector("input[type='email']")).sendKeys("k.nismaashraf@gmail.com");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(5000);
	softAssert.assertAll();
	driver.quit();
	
	}


}