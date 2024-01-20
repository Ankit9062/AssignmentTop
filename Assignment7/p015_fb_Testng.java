package Tops.Assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basic.driverconnection;

public class p015_fb_Testng {
	WebDriver driver ;
	@BeforeClass
    public void open_browser() {
		String url = "https://www.facebook.com";
	    driver = driverconnection.getDriver(url);
		
		
	}
   @Test
   public void login () {
      WebElement email = driver.findElement(By.id("email"));
      email.sendKeys("sandhiaakib5@gmail.com");
      WebElement password = driver.findElement(By.id("pass"));
      password.sendKeys("S@ndhi9596");
      WebElement loginclick = driver.findElement(By.id("login"));
      loginclick.click();
      
      
}





}
