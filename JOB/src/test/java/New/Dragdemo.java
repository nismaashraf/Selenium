package New;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dragdemo {
	@Test
	public void Add() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement From = driver.findElement(By.id("draggable"));
		WebElement To = driver.findElement(By.id("droppable"));
		Actions Act = new Actions(driver);
		Thread.sleep(2000);
		Act.dragAndDrop(From, To).build().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.close();
		
		
	}

}
