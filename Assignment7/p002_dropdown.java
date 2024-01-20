package Tops.Assigment_selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basic.driverconnection;

public class p002_dropdown {
	public static void main(String[] args) {
	
    String url = "https://demo.guru99.com/test/newtours/reservation.php";
    WebDriver driver = driverconnection.getDriver(url);
  
    WebElement passenger = driver.findElement(By.name("passCount"));
    Select Dropdown = new Select(passenger);
    Dropdown.selectByVisibleText("2 ");  
    
   WebElement Dfrom = driver.findElement(By.name("fromPort"));
    Select drp = new Select(Dfrom);
    drp.selectByIndex(3);
     
    driver.quit();
}
}