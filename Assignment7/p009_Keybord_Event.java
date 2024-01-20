package Tops.Assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.driverconnection;

public class p009_Keybord_Event {
   public static void main(String[] args) {
	   String url = "https://www.facebook.com";
	   WebDriver driver = driverconnection.getDriver(url);
	   
	   WebElement username = driver.findElement(By.name("email"));
	   Actions action = new Actions(driver);
	   action.click(username)
	         .sendKeys("sandhiaakib5@gmail.com")
	         .keyDown(Keys.RIGHT)
	         .build()
	         .perform();
}
}
