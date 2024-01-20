package Tops.Assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.driverconnection;

public class p001_linktext {
	public static void main(String[] args) {
		
	
   String url = "https://demoqa.com/links";
   WebDriver driver = driverconnection.getDriver(url);
  
   WebElement linktext = driver.findElement(By.linkText("Home"));
   linktext.click();
   WebElement partialLinktext = driver.findElement(By.partialLinkText("home"));
   partialLinktext.click();
   
   
   
   
}
}