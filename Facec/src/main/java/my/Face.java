package my;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;


public class Face {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		 WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		String T= driver.getTitle();
		System.out.println(T+ "++++");
		Assert.assertEquals(true,true);
				
		//driver.findElement(By.cssSelector("button[value='1']")).click();
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("Forgot password?")).click();
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
  driver.quit();
	}
}