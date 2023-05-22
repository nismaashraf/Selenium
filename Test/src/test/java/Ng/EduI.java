package Ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EduI {
	@BeforeClass 
	public void WebLoginEducationInsurance() {
		System.out.println("Eduaction insurance Web login");
	}

	@Test
	public void WebLogoutEducationInsurance() {
		System.out.println("Education insurance Web logout");
	}

	@AfterClass
	public void MobileLoginEducationInsurance() {
		System.out.println("EDUCATION insurance mob login");
	}

	@Test(priority = 4)
	public void MobileLogoutEducationInsurance() {
		System.out.println("Education insurance mob logout");
	}

}
