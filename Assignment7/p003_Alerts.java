package Tops.Assigment_selenium;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.driverconnection;

public class p003_Alerts {
	public static void main(String[] args) {
	
   String url = "https://demoqa.com/alerts";
   WebDriver driver = driverconnection.getDriver(url);
  
   WebElement Alert= driver.findElement(By.id("alertButton"));
   Alert.click();
   Alert alert = driver.switchTo().alert();
   alert.accept();
    
   WebElement alert1 =driver.findElement(By.id("promtButton"));
   alert1.click();
   Alert aler = driver.switchTo().alert();
   aler.sendKeys("sandhi");
   aler.accept();
  
}
}