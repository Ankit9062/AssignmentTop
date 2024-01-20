package Tops.Assigment_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.driverconnection;

public class p010_Alert {
   public static void main(String[] args) {
	   String url = "https://demo.guru99.com/test/delete_customer.php";
	   WebDriver driver = driverconnection.getDriver(url);
	   
	   WebElement username = driver.findElement(By.name("cusid"));
	   username.sendKeys("sandhiaakib5@gmail.com");

       WebElement submit =driver.findElement(By.name("submit"));
       submit.click();
       driver.switchTo().alert();
       Alert alert = driver.switchTo().alert();
       alert.accept();
       alert.accept();
       
       
}
}
