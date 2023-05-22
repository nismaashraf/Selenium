package New;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataP {
	
	 WebDriver driver;
@BeforeMethod

	public void Ad() throws InterruptedException {

		 driver=new ChromeDriver();
			driver.navigate().to("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			}
@Test(dataProvider="test")
public void Login(String uname,String password) {
	driver.findElement(By.id("user-name")).click();
	driver.findElement(By.id("user-name")).sendKeys(uname);
	driver.findElement(By.id("password")).click();
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("login-button")).click();
}
@DataProvider(name="test")
public Object Value() {
	Object[][] data=new Object[4][2];
	data[0][0]="standard_user";
	data[0][1]="secret_sauce";
	data[1][0]="locked_out_user";
	data[1][1]="secret_sauce";
	data[2][0]="problem_user";
	data[2][1]="secret_sauce";
	data[3][0]="performance_glitch_user";
	data[3][1]="secret_sauce";
	return data;
}
	
}
