package Tops.Assigment_selenium;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.driverconnection;

public class p013_fb_junit {
    WebDriver driver ;
 
	
	@Before
    public  void browser () {
    	String url ="https://www.facebook.com";
        driver  = driverconnection.getDriver(url);
    	
    }
   @Test
    public void login() {
	   WebElement username = driver.findElement(By.name("email"));
	   username.sendKeys("patelankit@gmail.com");
	   WebElement pass = driver.findElement(By.name("pass"));
	   pass.sendKeys("Ankit@1993");
       WebElement login = driver.findElement(By.name("login"));
       login.click();

   }
}
