package Ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HoI {
	@Test(priority = 0, enabled = true)
	public void WebLoginHomeInsurance() {
		System.out.println("Home insurance Web login");

		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

	}

	 @BeforeSuite
	public void WebLogoutHomeInsurance() {
		System.out.println("Home insurance Web logout");
	}

	@Test
	public void MobileLoginHomeInsurance() {
		System.out.println("Home insurance mob login");
	}

	@Test(priority = 1)
	public void MobileLogoutHomeInsurance() {
		System.out.println("HOME insurance mob logout");
	}

}
