package Two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;

public class Two {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		String T = driver.getTitle();
		System.out.println("this" + T);
		String D = driver.getCurrentUrl();
		System.out.println("this is=" + D);
		String M = driver.getPageSource();
		System.out.println(M);

		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[placeholder='Username']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		// driver.findElement(By.cssSelector("#login-button")).click();
		driver.findElement(By.cssSelector(".submit-button btn_action")).click();
		Thread.sleep(5000);
		driver.quit();

	}
}
