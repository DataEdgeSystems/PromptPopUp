package com.dataedge;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PromptPopUp {
	WebDriver driver=new FirefoxDriver();
	@Test
	public void ExampleForPromptBox() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/VikRamShaRma/Desktop/selenium/popup.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		Alert alert=driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Helllo");
		alert.accept();
		System.out.println(alert.getText());
	}
}