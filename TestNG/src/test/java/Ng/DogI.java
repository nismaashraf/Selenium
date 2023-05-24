package Ng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DogI {
	@AfterTest
	public void After() {
		System.out.println("Last work");
	}
	@Test(enabled = true)
	public void WebLoginDogInsurance() {
		System.out.println("dog insurance Web login");
	}

	@BeforeMethod
	public void WebLogoutDogInsurance() {
		System.out.println("dog insurance Web logout");
	}

	@Test
	public void MobileLoginDogInsurance() {
		System.out.println("dog insurance mob login");
	}

	@AfterTest
	public void MobileLogoutDogInsurance() {
		System.out.println("dog insurance mob logout");
		
	}
	@BeforeTest
	public void Before() {
		System.out.println("first work");
	}
	

}
