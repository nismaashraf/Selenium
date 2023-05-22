package New;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Web {
	WebDriver driver;

	@BeforeMethod
	public void Add() throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test(invocationCount=2)
	public void Admin() throws InterruptedException {

		driver.findElement(By.id("single-input-field")).click();
		driver.findElement(By.id("single-input-field")).sendKeys("this is the message");
		driver.findElement(By.id("single-input-field")).clear();
		boolean status = driver.findElement(By.id("single-input-field")).isDisplayed();
		System.out.println(status + "is dispalyed");
		boolean status1 = driver.findElement(By.id("single-input-field")).isEnabled();
		System.out.println(status1 + "is Enabled");
		WebElement Ax = driver.findElement(By.id("button-one"));
		String Atr = Ax.getAttribute("id");
		System.out.println(Atr + " -isAttribute Name");
		String A = driver.findElement(By.id("message-one")).getTagName();
		System.out.println(A + " -tagname");
		driver.findElement(By.id("value-a")).click();
		WebElement Size = driver.findElement(By.id("value-a"));
		Dimension Bs = Size.getSize();
		System.out.println("Height :" + Bs.height + "Width : " + Bs.width);
		driver.findElement(By.id("value-a")).sendKeys("5");
		driver.findElement(By.cssSelector("input[id='value-b']")).click();
		driver.findElement(By.cssSelector(("input[id='value-b']"))).sendKeys("10");
		driver.findElement(By.cssSelector("button[id='button-two']")).click();
		String Expect = "Total A + B : 15";
		String ActualNum = driver.findElement(By.id("message-two")).getText();
		driver.findElement(By.id("message-two")).submit();
		Thread.sleep(3000);
		Point Act = driver.findElement(By.id("message-two")).getLocation();
		System.out.println("X cordinate : " + Act.x + "Y cordinate: " + Act.y);
		Assert.assertEquals(ActualNum, Expect, "fail");
	}

	@AfterMethod

	public void Z() {

		driver.quit();

	}

}
